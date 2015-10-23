package org.eclipse.xtext.idea.lang.parser;

import org.eclipse.xtext.idea.nodemodel.IASTNodeAwareNodeModelBuilder;
import org.eclipse.xtext.idea.lang.XtextElementTypeProvider;
import org.eclipse.xtext.idea.lang.psi.impl.XtextFileImpl;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;
import org.eclipse.xtext.psi.impl.PsiNamedEObjectImpl;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class XtextParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private XtextElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new XtextFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		Boolean hasSemanticElement = node.getUserData(IASTNodeAwareNodeModelBuilder.HAS_SEMANTIC_ELEMENT_KEY);
		if (hasSemanticElement != null && hasSemanticElement) {
			if (elementType == elementTypeProvider.getAbstractMetamodelDeclaration_GeneratedMetamodelParserRuleCall_0ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getGeneratedMetamodel_NameValidIDParserRuleCall_1_0ElementType()
				);
			}
			if (elementType == elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_0_1ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getRuleNameAndParams_NameValidIDParserRuleCall_0_0ElementType()
				);
			}
			if (elementType == elementTypeProvider.getParserRule_RuleNameAndParamsParserRuleCall_0_1_0ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getRuleNameAndParams_NameValidIDParserRuleCall_0_0ElementType()
				);
			}
			if (elementType == elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_0_0ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getParameter_NameIDTerminalRuleCall_0ElementType()
				);
			}
			if (elementType == elementTypeProvider.getRuleNameAndParams_ParametersParameterParserRuleCall_1_1_1_1_0ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getParameter_NameIDTerminalRuleCall_0ElementType()
				);
			}
			if (elementType == elementTypeProvider.getAbstractRule_TerminalRuleParserRuleCall_1ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getTerminalRule_NameValidIDParserRuleCall_1_0_1_0ElementType(),
					elementTypeProvider.getTerminalRule_NameValidIDParserRuleCall_1_1_0_0ElementType()
				);
			}
			if (elementType == elementTypeProvider.getAbstractRule_EnumRuleParserRuleCall_2ElementType()) {
				return new PsiNamedEObjectImpl(node,
					elementTypeProvider.getEnumRule_NameValidIDParserRuleCall_1_0ElementType()
				);
			}
		}
		return super.createElement(node);
	}

}
