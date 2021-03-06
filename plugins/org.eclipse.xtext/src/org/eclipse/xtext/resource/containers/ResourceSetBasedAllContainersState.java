/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.resource.containers;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;

import com.google.common.base.Joiner;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;

/**
 * This implementation {@link IAllContainersState} associates resource (e.g. their URIs) to containers. It assumes that
 * all URIs and their containers are known when {@link #configure(List, Multimap)} is called.
 * 
 * @see FlatResourceSetBasedAllContainersState
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
public class ResourceSetBasedAllContainersState implements IAllContainersState {
	
	private SetMultimap<String, URI> container2URIs;
	private SetMultimap<URI, String> uri2container;
	private List<String> containers;
	
	public void configure(List<String> containers, Multimap<String, URI> container2Uris) {
		this.containers = containers;
		this.container2URIs = HashMultimap.create(container2Uris);
		this.uri2container = Multimaps.invertFrom(HashMultimap.create(container2Uris), HashMultimap.<URI, String>create());
	}

	@Override
	public List<String> getVisibleContainerHandles(String handle) {
		return containers;
	}

	@Override
	public Collection<URI> getContainedURIs(String containerHandle) {
		return container2URIs.get(containerHandle);
	}
	
	@Override
	public boolean isEmpty(String containerHandle) {
		return getContainedURIs(containerHandle).isEmpty();
	}

	@Override
	public String getContainerHandle(URI uri) {
		Set<String> set = uri2container.get(uri);
		if (set!=null && !set.isEmpty())
			return set.iterator().next();
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[");
		result.append(getClass().getSimpleName());
		Set<String> invisibleContainers = Sets.newHashSet(container2URIs.keySet());
		invisibleContainers.removeAll(containers);
		if (!invisibleContainers.isEmpty()) {
			result.append("\n  WARNING: invisible containers: ");
			result.append(Joiner.on(", ").join(invisibleContainers));
		}
		for (String container : containers) {
			Collection<URI> uris = container2URIs.get(container);
			result.append("\n  container ");
			result.append(container);
			result.append(" = ");
			if (uris.isEmpty())
				result.append("(empty)");
			else {
				result.append("{\n    ");
				result.append(Joiner.on("\n    ").join(uris));
				result.append("\n  }");
			}
		}
		result.append("\n]");
		return result.toString();
	}

}
