/*
 * generated by Xtext
 */
package org.eclipse.xtext.linking.lazy.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Bug311337TestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalBug311337TestLanguage.tokens");
	}
}
