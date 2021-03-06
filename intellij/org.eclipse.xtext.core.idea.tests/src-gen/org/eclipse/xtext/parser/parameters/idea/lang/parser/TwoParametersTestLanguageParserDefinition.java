package org.eclipse.xtext.parser.parameters.idea.lang.parser;

import org.eclipse.xtext.psi.impl.PsiEObjectImpl;
import org.eclipse.xtext.parser.parameters.idea.lang.TwoParametersTestLanguageElementTypeProvider;
import org.eclipse.xtext.parser.parameters.idea.lang.psi.impl.TwoParametersTestLanguageFileImpl;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class TwoParametersTestLanguageParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private TwoParametersTestLanguageElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new TwoParametersTestLanguageFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		if (elementType == elementTypeProvider.getParserRuleParametersElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_GroupElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ParserRuleParametersAction_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Alternatives_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitOneKeyword_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_0_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario5ParserRuleCall_1_0_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitTwoKeyword_1_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario5ParserRuleCall_1_1_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_2ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitThreeKeyword_1_2_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_2_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_2_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_3ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitFourKeyword_1_3_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_3_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_3_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_4ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_4_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitFiveKeyword_1_4_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_4_0_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_4_0_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_5ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_5_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitSixKeyword_1_5_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_5_0_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_5_0_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_6ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitSevenKeyword_1_6_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_6_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario7ParserRuleCall_1_6_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_7ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitEightKeyword_1_7_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_7_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario7ParserRuleCall_1_7_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_8ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitNineKeyword_1_8_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Alternatives_1_8_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_8_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario8ParserRuleCall_1_8_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_8_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_8_1_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_8_1_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_KeywordKeyword_1_8_1_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_9ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitOneDigitZeroKeyword_1_9_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Alternatives_1_9_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_9_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario8ParserRuleCall_1_9_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_9_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_9_1_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_9_1_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_KeywordKeyword_1_9_1_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_10ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitOneDigitOneKeyword_1_10_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Alternatives_1_10_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_10_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario8ParserRuleCall_1_10_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_10_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_10_1_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_10_1_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_KeywordKeyword_1_10_1_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_11ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_NumberSignDigitOneDigitTwoKeyword_1_11_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Alternatives_1_11_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_11_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario8ParserRuleCall_1_11_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_Group_1_11_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioAssignment_1_11_1_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_ScenarioScenario6ParserRuleCall_1_11_1_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getParserRuleParameters_KeywordKeyword_1_11_1_1_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_AlternativesElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_Group_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_FirstAssignment_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_FirstIDTerminalRuleCall_0_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_Group_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_SecondAssignment_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario5_SecondIDTerminalRuleCall_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario6ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario6_FirstAssignmentElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario6_FirstIdOrKeyword2ParserRuleCall_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario7ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario7_AlternativesElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario7_FirstAssignment_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario7_FirstIdOrKeyword2ParserRuleCall_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario7_SecondAssignment_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario7_SecondKeywordKeyword_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario8ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario8_GroupElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario8_SecondAssignment_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario8_SecondIdOrKeyword2ParserRuleCall_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario8_KeywordKeyword_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword2ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword2_AlternativesElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword2_Group_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword2_KeywordKeyword_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword2_IDTerminalRuleCall_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_AlternativesElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_Group_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_FirstAssignment_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_FirstIDTerminalRuleCall_0_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_Group_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_SecondAssignment_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario1_SecondIDTerminalRuleCall_1_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario2ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario2_FirstAssignmentElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario2_FirstIdOrKeywordParserRuleCall_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario3ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario3_AlternativesElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario3_FirstAssignment_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario3_FirstIdOrKeywordParserRuleCall_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario3_SecondAssignment_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario3_SecondKeywordKeyword_1_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario4ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario4_GroupElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario4_SecondAssignment_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario4_SecondIdOrKeywordParserRuleCall_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getScenario4_KeywordKeyword_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeywordElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword_AlternativesElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword_Group_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword_KeywordKeyword_0_0ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		if (elementType == elementTypeProvider.getIdOrKeyword_IDTerminalRuleCall_1ElementType()) {
			return new PsiEObjectImpl(node) {};
		}
		throw new java.lang.IllegalStateException("Unexpected element type: " + elementType);
	}

}
