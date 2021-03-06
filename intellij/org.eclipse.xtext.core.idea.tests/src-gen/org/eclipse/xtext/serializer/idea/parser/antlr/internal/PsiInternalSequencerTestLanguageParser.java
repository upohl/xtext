package org.eclipse.xtext.serializer.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.serializer.idea.lang.SequencerTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.serializer.services.SequencerTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalSequencerTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ID1", "RULE_ID2", "RULE_ID3", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'kw1'", "'kw2'", "'#3'", "'kw3'", "'#4'", "'#5'", "'kw4'", "'kw5'", "'#6'", "','", "'#7'", "'#8'", "'#9'", "'kw'", "'#10'", "'#11'", "'#12'", "'#13'", "'#14'", "'#15'", "'#16'", "'#17'", "'#18'", "'#19'", "'#20'", "'#21'", "'#22'", "'Bye'", "'#23'", "'#24'", "'#25'", "'#26'", "'#27'", "'kw6'", "'#28'", "'.'", "'#29'", "'#30'", "'#31'", "'#32'", "'#33'", "'#34'", "'kwp2'", "'kwp1'", "'kwp3'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ID1=5;
    public static final int RULE_ID2=6;
    public static final int RULE_ID3=7;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public PsiInternalSequencerTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalSequencerTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalSequencerTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalSequencerTestLanguage.g"; }



    	protected SequencerTestLanguageGrammarAccess grammarAccess;

    	protected SequencerTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalSequencerTestLanguageParser(PsiBuilder builder, TokenStream input, SequencerTestLanguageElementTypeProvider elementTypeProvider, SequencerTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalSequencerTestLanguage.g:52:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:52:15: ( ruleModel EOF )
            // PsiInternalSequencerTestLanguage.g:53:2: ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModel();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalSequencerTestLanguage.g:58:1: ruleModel : ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) | ( (lv_x26_25_0= ruleUnorderedGroupBoolean ) ) | ( (lv_x27_26_0= ruleComplex1 ) ) | ( (lv_x28_27_0= ruleOptionalDouble ) ) | ( (lv_x29_28_0= ruleNullValueGenerated ) ) | ( (lv_x30_29_0= ruleNullValueInterpreted ) ) | ( (lv_x31_30_0= ruleNullCrossRefGenerated ) ) | ( (lv_x32_31_0= ruleNullCrossRefInterpreted ) ) | ( (lv_x33_32_0= ruleFragmentCaller ) ) | ( (lv_x34_33_0= ruleParameterCaller ) ) ) ;
    public final void ruleModel() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:58:10: ( ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) | ( (lv_x26_25_0= ruleUnorderedGroupBoolean ) ) | ( (lv_x27_26_0= ruleComplex1 ) ) | ( (lv_x28_27_0= ruleOptionalDouble ) ) | ( (lv_x29_28_0= ruleNullValueGenerated ) ) | ( (lv_x30_29_0= ruleNullValueInterpreted ) ) | ( (lv_x31_30_0= ruleNullCrossRefGenerated ) ) | ( (lv_x32_31_0= ruleNullCrossRefInterpreted ) ) | ( (lv_x33_32_0= ruleFragmentCaller ) ) | ( (lv_x34_33_0= ruleParameterCaller ) ) ) )
            // PsiInternalSequencerTestLanguage.g:59:2: ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) | ( (lv_x26_25_0= ruleUnorderedGroupBoolean ) ) | ( (lv_x27_26_0= ruleComplex1 ) ) | ( (lv_x28_27_0= ruleOptionalDouble ) ) | ( (lv_x29_28_0= ruleNullValueGenerated ) ) | ( (lv_x30_29_0= ruleNullValueInterpreted ) ) | ( (lv_x31_30_0= ruleNullCrossRefGenerated ) ) | ( (lv_x32_31_0= ruleNullCrossRefInterpreted ) ) | ( (lv_x33_32_0= ruleFragmentCaller ) ) | ( (lv_x34_33_0= ruleParameterCaller ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:59:2: ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) | ( (lv_x26_25_0= ruleUnorderedGroupBoolean ) ) | ( (lv_x27_26_0= ruleComplex1 ) ) | ( (lv_x28_27_0= ruleOptionalDouble ) ) | ( (lv_x29_28_0= ruleNullValueGenerated ) ) | ( (lv_x30_29_0= ruleNullValueInterpreted ) ) | ( (lv_x31_30_0= ruleNullCrossRefGenerated ) ) | ( (lv_x32_31_0= ruleNullCrossRefInterpreted ) ) | ( (lv_x33_32_0= ruleFragmentCaller ) ) | ( (lv_x34_33_0= ruleParameterCaller ) ) )
            int alt1=34;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 26:
                {
                alt1=7;
                }
                break;
            case 27:
                {
                alt1=8;
                }
                break;
            case 28:
                {
                alt1=9;
                }
                break;
            case 30:
                {
                alt1=10;
                }
                break;
            case 31:
                {
                alt1=11;
                }
                break;
            case 32:
                {
                alt1=12;
                }
                break;
            case 36:
                {
                alt1=13;
                }
                break;
            case 37:
                {
                alt1=14;
                }
                break;
            case 38:
                {
                alt1=15;
                }
                break;
            case 33:
                {
                alt1=16;
                }
                break;
            case 34:
                {
                alt1=17;
                }
                break;
            case 35:
                {
                alt1=18;
                }
                break;
            case 39:
                {
                alt1=19;
                }
                break;
            case 40:
                {
                alt1=20;
                }
                break;
            case 41:
                {
                alt1=21;
                }
                break;
            case 42:
                {
                alt1=22;
                }
                break;
            case 44:
                {
                alt1=23;
                }
                break;
            case 45:
                {
                alt1=24;
                }
                break;
            case 46:
                {
                alt1=25;
                }
                break;
            case 47:
                {
                alt1=26;
                }
                break;
            case 48:
                {
                alt1=27;
                }
                break;
            case 50:
                {
                alt1=28;
                }
                break;
            case 52:
                {
                alt1=29;
                }
                break;
            case 53:
                {
                alt1=30;
                }
                break;
            case 54:
                {
                alt1=31;
                }
                break;
            case 55:
                {
                alt1=32;
                }
                break;
            case 56:
                {
                alt1=33;
                }
                break;
            case 57:
                {
                alt1=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:60:3: ( (lv_x1_0_0= ruleSimpleGroup ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:60:3: ( (lv_x1_0_0= ruleSimpleGroup ) )
                    // PsiInternalSequencerTestLanguage.g:61:4: (lv_x1_0_0= ruleSimpleGroup )
                    {
                    // PsiInternalSequencerTestLanguage.g:61:4: (lv_x1_0_0= ruleSimpleGroup )
                    // PsiInternalSequencerTestLanguage.g:62:5: lv_x1_0_0= ruleSimpleGroup
                    {

                    					markComposite(elementTypeProvider.getModel_X1SimpleGroupParserRuleCall_0_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSimpleGroup();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:72:3: ( (lv_x2_1_0= ruleSimpleAlternative ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:72:3: ( (lv_x2_1_0= ruleSimpleAlternative ) )
                    // PsiInternalSequencerTestLanguage.g:73:4: (lv_x2_1_0= ruleSimpleAlternative )
                    {
                    // PsiInternalSequencerTestLanguage.g:73:4: (lv_x2_1_0= ruleSimpleAlternative )
                    // PsiInternalSequencerTestLanguage.g:74:5: lv_x2_1_0= ruleSimpleAlternative
                    {

                    					markComposite(elementTypeProvider.getModel_X2SimpleAlternativeParserRuleCall_1_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSimpleAlternative();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:84:3: ( (lv_x3_2_0= ruleSimpleMultiplicities ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:84:3: ( (lv_x3_2_0= ruleSimpleMultiplicities ) )
                    // PsiInternalSequencerTestLanguage.g:85:4: (lv_x3_2_0= ruleSimpleMultiplicities )
                    {
                    // PsiInternalSequencerTestLanguage.g:85:4: (lv_x3_2_0= ruleSimpleMultiplicities )
                    // PsiInternalSequencerTestLanguage.g:86:5: lv_x3_2_0= ruleSimpleMultiplicities
                    {

                    					markComposite(elementTypeProvider.getModel_X3SimpleMultiplicitiesParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSimpleMultiplicities();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalSequencerTestLanguage.g:96:3: ( (lv_x4_3_0= ruleGroupMultiplicities ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:96:3: ( (lv_x4_3_0= ruleGroupMultiplicities ) )
                    // PsiInternalSequencerTestLanguage.g:97:4: (lv_x4_3_0= ruleGroupMultiplicities )
                    {
                    // PsiInternalSequencerTestLanguage.g:97:4: (lv_x4_3_0= ruleGroupMultiplicities )
                    // PsiInternalSequencerTestLanguage.g:98:5: lv_x4_3_0= ruleGroupMultiplicities
                    {

                    					markComposite(elementTypeProvider.getModel_X4GroupMultiplicitiesParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGroupMultiplicities();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // PsiInternalSequencerTestLanguage.g:108:3: ( (lv_x5_4_0= ruleAlternativeMultiplicities ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:108:3: ( (lv_x5_4_0= ruleAlternativeMultiplicities ) )
                    // PsiInternalSequencerTestLanguage.g:109:4: (lv_x5_4_0= ruleAlternativeMultiplicities )
                    {
                    // PsiInternalSequencerTestLanguage.g:109:4: (lv_x5_4_0= ruleAlternativeMultiplicities )
                    // PsiInternalSequencerTestLanguage.g:110:5: lv_x5_4_0= ruleAlternativeMultiplicities
                    {

                    					markComposite(elementTypeProvider.getModel_X5AlternativeMultiplicitiesParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAlternativeMultiplicities();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // PsiInternalSequencerTestLanguage.g:120:3: ( (lv_x6_5_0= ruleList1 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:120:3: ( (lv_x6_5_0= ruleList1 ) )
                    // PsiInternalSequencerTestLanguage.g:121:4: (lv_x6_5_0= ruleList1 )
                    {
                    // PsiInternalSequencerTestLanguage.g:121:4: (lv_x6_5_0= ruleList1 )
                    // PsiInternalSequencerTestLanguage.g:122:5: lv_x6_5_0= ruleList1
                    {

                    					markComposite(elementTypeProvider.getModel_X6List1ParserRuleCall_5_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleList1();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // PsiInternalSequencerTestLanguage.g:132:3: ( (lv_x7_6_0= ruleList2 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:132:3: ( (lv_x7_6_0= ruleList2 ) )
                    // PsiInternalSequencerTestLanguage.g:133:4: (lv_x7_6_0= ruleList2 )
                    {
                    // PsiInternalSequencerTestLanguage.g:133:4: (lv_x7_6_0= ruleList2 )
                    // PsiInternalSequencerTestLanguage.g:134:5: lv_x7_6_0= ruleList2
                    {

                    					markComposite(elementTypeProvider.getModel_X7List2ParserRuleCall_6_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleList2();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // PsiInternalSequencerTestLanguage.g:144:3: ( (lv_x8_7_0= ruleAltList1 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:144:3: ( (lv_x8_7_0= ruleAltList1 ) )
                    // PsiInternalSequencerTestLanguage.g:145:4: (lv_x8_7_0= ruleAltList1 )
                    {
                    // PsiInternalSequencerTestLanguage.g:145:4: (lv_x8_7_0= ruleAltList1 )
                    // PsiInternalSequencerTestLanguage.g:146:5: lv_x8_7_0= ruleAltList1
                    {

                    					markComposite(elementTypeProvider.getModel_X8AltList1ParserRuleCall_7_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAltList1();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // PsiInternalSequencerTestLanguage.g:156:3: ( (lv_x9_8_0= ruleAltList2 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:156:3: ( (lv_x9_8_0= ruleAltList2 ) )
                    // PsiInternalSequencerTestLanguage.g:157:4: (lv_x9_8_0= ruleAltList2 )
                    {
                    // PsiInternalSequencerTestLanguage.g:157:4: (lv_x9_8_0= ruleAltList2 )
                    // PsiInternalSequencerTestLanguage.g:158:5: lv_x9_8_0= ruleAltList2
                    {

                    					markComposite(elementTypeProvider.getModel_X9AltList2ParserRuleCall_8_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAltList2();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // PsiInternalSequencerTestLanguage.g:168:3: ( (lv_x10_9_0= ruleSingleKeywords ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:168:3: ( (lv_x10_9_0= ruleSingleKeywords ) )
                    // PsiInternalSequencerTestLanguage.g:169:4: (lv_x10_9_0= ruleSingleKeywords )
                    {
                    // PsiInternalSequencerTestLanguage.g:169:4: (lv_x10_9_0= ruleSingleKeywords )
                    // PsiInternalSequencerTestLanguage.g:170:5: lv_x10_9_0= ruleSingleKeywords
                    {

                    					markComposite(elementTypeProvider.getModel_X10SingleKeywordsParserRuleCall_9_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleKeywords();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // PsiInternalSequencerTestLanguage.g:180:3: ( (lv_x11_10_0= ruleSingleKeywordsOrID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:180:3: ( (lv_x11_10_0= ruleSingleKeywordsOrID ) )
                    // PsiInternalSequencerTestLanguage.g:181:4: (lv_x11_10_0= ruleSingleKeywordsOrID )
                    {
                    // PsiInternalSequencerTestLanguage.g:181:4: (lv_x11_10_0= ruleSingleKeywordsOrID )
                    // PsiInternalSequencerTestLanguage.g:182:5: lv_x11_10_0= ruleSingleKeywordsOrID
                    {

                    					markComposite(elementTypeProvider.getModel_X11SingleKeywordsOrIDParserRuleCall_10_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleKeywordsOrID();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // PsiInternalSequencerTestLanguage.g:192:3: ( (lv_x12_11_0= ruleSingleTerminals ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:192:3: ( (lv_x12_11_0= ruleSingleTerminals ) )
                    // PsiInternalSequencerTestLanguage.g:193:4: (lv_x12_11_0= ruleSingleTerminals )
                    {
                    // PsiInternalSequencerTestLanguage.g:193:4: (lv_x12_11_0= ruleSingleTerminals )
                    // PsiInternalSequencerTestLanguage.g:194:5: lv_x12_11_0= ruleSingleTerminals
                    {

                    					markComposite(elementTypeProvider.getModel_X12SingleTerminalsParserRuleCall_11_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleTerminals();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 13 :
                    // PsiInternalSequencerTestLanguage.g:204:3: ( (lv_x10_12_0= ruleMultiKeywords ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:204:3: ( (lv_x10_12_0= ruleMultiKeywords ) )
                    // PsiInternalSequencerTestLanguage.g:205:4: (lv_x10_12_0= ruleMultiKeywords )
                    {
                    // PsiInternalSequencerTestLanguage.g:205:4: (lv_x10_12_0= ruleMultiKeywords )
                    // PsiInternalSequencerTestLanguage.g:206:5: lv_x10_12_0= ruleMultiKeywords
                    {

                    					markComposite(elementTypeProvider.getModel_X10MultiKeywordsParserRuleCall_12_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMultiKeywords();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 14 :
                    // PsiInternalSequencerTestLanguage.g:216:3: ( (lv_x11_13_0= ruleMultiKeywordsOrID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:216:3: ( (lv_x11_13_0= ruleMultiKeywordsOrID ) )
                    // PsiInternalSequencerTestLanguage.g:217:4: (lv_x11_13_0= ruleMultiKeywordsOrID )
                    {
                    // PsiInternalSequencerTestLanguage.g:217:4: (lv_x11_13_0= ruleMultiKeywordsOrID )
                    // PsiInternalSequencerTestLanguage.g:218:5: lv_x11_13_0= ruleMultiKeywordsOrID
                    {

                    					markComposite(elementTypeProvider.getModel_X11MultiKeywordsOrIDParserRuleCall_13_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMultiKeywordsOrID();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 15 :
                    // PsiInternalSequencerTestLanguage.g:228:3: ( (lv_x12_14_0= ruleMultiTerminals ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:228:3: ( (lv_x12_14_0= ruleMultiTerminals ) )
                    // PsiInternalSequencerTestLanguage.g:229:4: (lv_x12_14_0= ruleMultiTerminals )
                    {
                    // PsiInternalSequencerTestLanguage.g:229:4: (lv_x12_14_0= ruleMultiTerminals )
                    // PsiInternalSequencerTestLanguage.g:230:5: lv_x12_14_0= ruleMultiTerminals
                    {

                    					markComposite(elementTypeProvider.getModel_X12MultiTerminalsParserRuleCall_14_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMultiTerminals();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 16 :
                    // PsiInternalSequencerTestLanguage.g:240:3: ( (lv_x13_15_0= ruleSingleEnum ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:240:3: ( (lv_x13_15_0= ruleSingleEnum ) )
                    // PsiInternalSequencerTestLanguage.g:241:4: (lv_x13_15_0= ruleSingleEnum )
                    {
                    // PsiInternalSequencerTestLanguage.g:241:4: (lv_x13_15_0= ruleSingleEnum )
                    // PsiInternalSequencerTestLanguage.g:242:5: lv_x13_15_0= ruleSingleEnum
                    {

                    					markComposite(elementTypeProvider.getModel_X13SingleEnumParserRuleCall_15_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleEnum();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 17 :
                    // PsiInternalSequencerTestLanguage.g:252:3: ( (lv_x14_16_0= ruleSingleCrossReference ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:252:3: ( (lv_x14_16_0= ruleSingleCrossReference ) )
                    // PsiInternalSequencerTestLanguage.g:253:4: (lv_x14_16_0= ruleSingleCrossReference )
                    {
                    // PsiInternalSequencerTestLanguage.g:253:4: (lv_x14_16_0= ruleSingleCrossReference )
                    // PsiInternalSequencerTestLanguage.g:254:5: lv_x14_16_0= ruleSingleCrossReference
                    {

                    					markComposite(elementTypeProvider.getModel_X14SingleCrossReferenceParserRuleCall_16_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleCrossReference();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 18 :
                    // PsiInternalSequencerTestLanguage.g:264:3: ( (lv_x15_17_0= ruleSingleContainmentReference ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:264:3: ( (lv_x15_17_0= ruleSingleContainmentReference ) )
                    // PsiInternalSequencerTestLanguage.g:265:4: (lv_x15_17_0= ruleSingleContainmentReference )
                    {
                    // PsiInternalSequencerTestLanguage.g:265:4: (lv_x15_17_0= ruleSingleContainmentReference )
                    // PsiInternalSequencerTestLanguage.g:266:5: lv_x15_17_0= ruleSingleContainmentReference
                    {

                    					markComposite(elementTypeProvider.getModel_X15SingleContainmentReferenceParserRuleCall_17_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleContainmentReference();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 19 :
                    // PsiInternalSequencerTestLanguage.g:276:3: ( (lv_x19_18_0= ruleDependentAlternative1 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:276:3: ( (lv_x19_18_0= ruleDependentAlternative1 ) )
                    // PsiInternalSequencerTestLanguage.g:277:4: (lv_x19_18_0= ruleDependentAlternative1 )
                    {
                    // PsiInternalSequencerTestLanguage.g:277:4: (lv_x19_18_0= ruleDependentAlternative1 )
                    // PsiInternalSequencerTestLanguage.g:278:5: lv_x19_18_0= ruleDependentAlternative1
                    {

                    					markComposite(elementTypeProvider.getModel_X19DependentAlternative1ParserRuleCall_18_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDependentAlternative1();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 20 :
                    // PsiInternalSequencerTestLanguage.g:288:3: ( (lv_x20_19_0= ruleDependentAlternative2 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:288:3: ( (lv_x20_19_0= ruleDependentAlternative2 ) )
                    // PsiInternalSequencerTestLanguage.g:289:4: (lv_x20_19_0= ruleDependentAlternative2 )
                    {
                    // PsiInternalSequencerTestLanguage.g:289:4: (lv_x20_19_0= ruleDependentAlternative2 )
                    // PsiInternalSequencerTestLanguage.g:290:5: lv_x20_19_0= ruleDependentAlternative2
                    {

                    					markComposite(elementTypeProvider.getModel_X20DependentAlternative2ParserRuleCall_19_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDependentAlternative2();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 21 :
                    // PsiInternalSequencerTestLanguage.g:300:3: ( (lv_x21_20_0= ruleOptional ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:300:3: ( (lv_x21_20_0= ruleOptional ) )
                    // PsiInternalSequencerTestLanguage.g:301:4: (lv_x21_20_0= ruleOptional )
                    {
                    // PsiInternalSequencerTestLanguage.g:301:4: (lv_x21_20_0= ruleOptional )
                    // PsiInternalSequencerTestLanguage.g:302:5: lv_x21_20_0= ruleOptional
                    {

                    					markComposite(elementTypeProvider.getModel_X21OptionalParserRuleCall_20_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOptional();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 22 :
                    // PsiInternalSequencerTestLanguage.g:312:3: ( (lv_x22_21_0= ruleFloat ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:312:3: ( (lv_x22_21_0= ruleFloat ) )
                    // PsiInternalSequencerTestLanguage.g:313:4: (lv_x22_21_0= ruleFloat )
                    {
                    // PsiInternalSequencerTestLanguage.g:313:4: (lv_x22_21_0= ruleFloat )
                    // PsiInternalSequencerTestLanguage.g:314:5: lv_x22_21_0= ruleFloat
                    {

                    					markComposite(elementTypeProvider.getModel_X22FloatParserRuleCall_21_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFloat();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 23 :
                    // PsiInternalSequencerTestLanguage.g:324:3: ( (lv_x23_22_0= ruleUnorderedAlternative ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:324:3: ( (lv_x23_22_0= ruleUnorderedAlternative ) )
                    // PsiInternalSequencerTestLanguage.g:325:4: (lv_x23_22_0= ruleUnorderedAlternative )
                    {
                    // PsiInternalSequencerTestLanguage.g:325:4: (lv_x23_22_0= ruleUnorderedAlternative )
                    // PsiInternalSequencerTestLanguage.g:326:5: lv_x23_22_0= ruleUnorderedAlternative
                    {

                    					markComposite(elementTypeProvider.getModel_X23UnorderedAlternativeParserRuleCall_22_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedAlternative();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 24 :
                    // PsiInternalSequencerTestLanguage.g:336:3: ( (lv_x24_23_0= ruleUnorderedGroup ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:336:3: ( (lv_x24_23_0= ruleUnorderedGroup ) )
                    // PsiInternalSequencerTestLanguage.g:337:4: (lv_x24_23_0= ruleUnorderedGroup )
                    {
                    // PsiInternalSequencerTestLanguage.g:337:4: (lv_x24_23_0= ruleUnorderedGroup )
                    // PsiInternalSequencerTestLanguage.g:338:5: lv_x24_23_0= ruleUnorderedGroup
                    {

                    					markComposite(elementTypeProvider.getModel_X24UnorderedGroupParserRuleCall_23_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedGroup();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 25 :
                    // PsiInternalSequencerTestLanguage.g:348:3: ( (lv_x25_24_0= ruleUnorderedGroupOptional ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:348:3: ( (lv_x25_24_0= ruleUnorderedGroupOptional ) )
                    // PsiInternalSequencerTestLanguage.g:349:4: (lv_x25_24_0= ruleUnorderedGroupOptional )
                    {
                    // PsiInternalSequencerTestLanguage.g:349:4: (lv_x25_24_0= ruleUnorderedGroupOptional )
                    // PsiInternalSequencerTestLanguage.g:350:5: lv_x25_24_0= ruleUnorderedGroupOptional
                    {

                    					markComposite(elementTypeProvider.getModel_X25UnorderedGroupOptionalParserRuleCall_24_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedGroupOptional();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 26 :
                    // PsiInternalSequencerTestLanguage.g:360:3: ( (lv_x26_25_0= ruleUnorderedGroupBoolean ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:360:3: ( (lv_x26_25_0= ruleUnorderedGroupBoolean ) )
                    // PsiInternalSequencerTestLanguage.g:361:4: (lv_x26_25_0= ruleUnorderedGroupBoolean )
                    {
                    // PsiInternalSequencerTestLanguage.g:361:4: (lv_x26_25_0= ruleUnorderedGroupBoolean )
                    // PsiInternalSequencerTestLanguage.g:362:5: lv_x26_25_0= ruleUnorderedGroupBoolean
                    {

                    					markComposite(elementTypeProvider.getModel_X26UnorderedGroupBooleanParserRuleCall_25_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnorderedGroupBoolean();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 27 :
                    // PsiInternalSequencerTestLanguage.g:372:3: ( (lv_x27_26_0= ruleComplex1 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:372:3: ( (lv_x27_26_0= ruleComplex1 ) )
                    // PsiInternalSequencerTestLanguage.g:373:4: (lv_x27_26_0= ruleComplex1 )
                    {
                    // PsiInternalSequencerTestLanguage.g:373:4: (lv_x27_26_0= ruleComplex1 )
                    // PsiInternalSequencerTestLanguage.g:374:5: lv_x27_26_0= ruleComplex1
                    {

                    					markComposite(elementTypeProvider.getModel_X27Complex1ParserRuleCall_26_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleComplex1();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 28 :
                    // PsiInternalSequencerTestLanguage.g:384:3: ( (lv_x28_27_0= ruleOptionalDouble ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:384:3: ( (lv_x28_27_0= ruleOptionalDouble ) )
                    // PsiInternalSequencerTestLanguage.g:385:4: (lv_x28_27_0= ruleOptionalDouble )
                    {
                    // PsiInternalSequencerTestLanguage.g:385:4: (lv_x28_27_0= ruleOptionalDouble )
                    // PsiInternalSequencerTestLanguage.g:386:5: lv_x28_27_0= ruleOptionalDouble
                    {

                    					markComposite(elementTypeProvider.getModel_X28OptionalDoubleParserRuleCall_27_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOptionalDouble();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 29 :
                    // PsiInternalSequencerTestLanguage.g:396:3: ( (lv_x29_28_0= ruleNullValueGenerated ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:396:3: ( (lv_x29_28_0= ruleNullValueGenerated ) )
                    // PsiInternalSequencerTestLanguage.g:397:4: (lv_x29_28_0= ruleNullValueGenerated )
                    {
                    // PsiInternalSequencerTestLanguage.g:397:4: (lv_x29_28_0= ruleNullValueGenerated )
                    // PsiInternalSequencerTestLanguage.g:398:5: lv_x29_28_0= ruleNullValueGenerated
                    {

                    					markComposite(elementTypeProvider.getModel_X29NullValueGeneratedParserRuleCall_28_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNullValueGenerated();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 30 :
                    // PsiInternalSequencerTestLanguage.g:408:3: ( (lv_x30_29_0= ruleNullValueInterpreted ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:408:3: ( (lv_x30_29_0= ruleNullValueInterpreted ) )
                    // PsiInternalSequencerTestLanguage.g:409:4: (lv_x30_29_0= ruleNullValueInterpreted )
                    {
                    // PsiInternalSequencerTestLanguage.g:409:4: (lv_x30_29_0= ruleNullValueInterpreted )
                    // PsiInternalSequencerTestLanguage.g:410:5: lv_x30_29_0= ruleNullValueInterpreted
                    {

                    					markComposite(elementTypeProvider.getModel_X30NullValueInterpretedParserRuleCall_29_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNullValueInterpreted();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 31 :
                    // PsiInternalSequencerTestLanguage.g:420:3: ( (lv_x31_30_0= ruleNullCrossRefGenerated ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:420:3: ( (lv_x31_30_0= ruleNullCrossRefGenerated ) )
                    // PsiInternalSequencerTestLanguage.g:421:4: (lv_x31_30_0= ruleNullCrossRefGenerated )
                    {
                    // PsiInternalSequencerTestLanguage.g:421:4: (lv_x31_30_0= ruleNullCrossRefGenerated )
                    // PsiInternalSequencerTestLanguage.g:422:5: lv_x31_30_0= ruleNullCrossRefGenerated
                    {

                    					markComposite(elementTypeProvider.getModel_X31NullCrossRefGeneratedParserRuleCall_30_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNullCrossRefGenerated();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 32 :
                    // PsiInternalSequencerTestLanguage.g:432:3: ( (lv_x32_31_0= ruleNullCrossRefInterpreted ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:432:3: ( (lv_x32_31_0= ruleNullCrossRefInterpreted ) )
                    // PsiInternalSequencerTestLanguage.g:433:4: (lv_x32_31_0= ruleNullCrossRefInterpreted )
                    {
                    // PsiInternalSequencerTestLanguage.g:433:4: (lv_x32_31_0= ruleNullCrossRefInterpreted )
                    // PsiInternalSequencerTestLanguage.g:434:5: lv_x32_31_0= ruleNullCrossRefInterpreted
                    {

                    					markComposite(elementTypeProvider.getModel_X32NullCrossRefInterpretedParserRuleCall_31_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNullCrossRefInterpreted();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 33 :
                    // PsiInternalSequencerTestLanguage.g:444:3: ( (lv_x33_32_0= ruleFragmentCaller ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:444:3: ( (lv_x33_32_0= ruleFragmentCaller ) )
                    // PsiInternalSequencerTestLanguage.g:445:4: (lv_x33_32_0= ruleFragmentCaller )
                    {
                    // PsiInternalSequencerTestLanguage.g:445:4: (lv_x33_32_0= ruleFragmentCaller )
                    // PsiInternalSequencerTestLanguage.g:446:5: lv_x33_32_0= ruleFragmentCaller
                    {

                    					markComposite(elementTypeProvider.getModel_X33FragmentCallerParserRuleCall_32_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFragmentCaller();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;
                case 34 :
                    // PsiInternalSequencerTestLanguage.g:456:3: ( (lv_x34_33_0= ruleParameterCaller ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:456:3: ( (lv_x34_33_0= ruleParameterCaller ) )
                    // PsiInternalSequencerTestLanguage.g:457:4: (lv_x34_33_0= ruleParameterCaller )
                    {
                    // PsiInternalSequencerTestLanguage.g:457:4: (lv_x34_33_0= ruleParameterCaller )
                    // PsiInternalSequencerTestLanguage.g:458:5: lv_x34_33_0= ruleParameterCaller
                    {

                    					markComposite(elementTypeProvider.getModel_X34ParameterCallerParserRuleCall_33_0ElementType());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParameterCaller();

                    state._fsp--;


                    					doneComposite();
                    				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSimpleGroup"
    // PsiInternalSequencerTestLanguage.g:471:1: entryRuleSimpleGroup : ruleSimpleGroup EOF ;
    public final void entryRuleSimpleGroup() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:471:21: ( ruleSimpleGroup EOF )
            // PsiInternalSequencerTestLanguage.g:472:2: ruleSimpleGroup EOF
            {
             markComposite(elementTypeProvider.getSimpleGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSimpleGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleGroup"


    // $ANTLR start "ruleSimpleGroup"
    // PsiInternalSequencerTestLanguage.g:477:1: ruleSimpleGroup : (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) ;
    public final void ruleSimpleGroup() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val2_2_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:477:16: ( (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:478:2: (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:478:2: (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:479:3: otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getSimpleGroup_NumberSignDigitOneKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:486:3: ( (lv_val1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:487:4: (lv_val1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:487:4: (lv_val1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:488:5: lv_val1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSimpleGroup_Val1IDTerminalRuleCall_1_0ElementType());
            				
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            					doneLeaf(lv_val1_1_0);
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:497:3: ( (lv_val2_2_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:498:4: (lv_val2_2_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:498:4: (lv_val2_2_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:499:5: lv_val2_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSimpleGroup_Val2IDTerminalRuleCall_2_0ElementType());
            				
            lv_val2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_val2_2_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSimpleGroup"


    // $ANTLR start "entryRuleSimpleAlternative"
    // PsiInternalSequencerTestLanguage.g:512:1: entryRuleSimpleAlternative : ruleSimpleAlternative EOF ;
    public final void entryRuleSimpleAlternative() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:512:27: ( ruleSimpleAlternative EOF )
            // PsiInternalSequencerTestLanguage.g:513:2: ruleSimpleAlternative EOF
            {
             markComposite(elementTypeProvider.getSimpleAlternativeElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSimpleAlternative();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleAlternative"


    // $ANTLR start "ruleSimpleAlternative"
    // PsiInternalSequencerTestLanguage.g:518:1: ruleSimpleAlternative : (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) ) ;
    public final void ruleSimpleAlternative() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val1_2_0=null;
        Token otherlv_3=null;
        Token lv_val2_4_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:518:22: ( (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:519:2: (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:519:2: (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:520:3: otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) )
            {

            			markLeaf(elementTypeProvider.getSimpleAlternative_NumberSignDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:527:3: ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:528:4: (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:528:4: (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:529:5: otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getSimpleAlternative_Kw1Keyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_1);
                    				
                    // PsiInternalSequencerTestLanguage.g:536:5: ( (lv_val1_2_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:537:6: (lv_val1_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:537:6: (lv_val1_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:538:7: lv_val1_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getSimpleAlternative_Val1IDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_val1_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:549:4: (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:549:4: (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:550:5: otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getSimpleAlternative_Kw2Keyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_3);
                    				
                    // PsiInternalSequencerTestLanguage.g:557:5: ( (lv_val2_4_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:558:6: (lv_val2_4_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:558:6: (lv_val2_4_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:559:7: lv_val2_4_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getSimpleAlternative_Val2IDTerminalRuleCall_1_1_1_0ElementType());
                    						
                    lv_val2_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_val2_4_0);
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSimpleAlternative"


    // $ANTLR start "entryRuleSimpleMultiplicities"
    // PsiInternalSequencerTestLanguage.g:574:1: entryRuleSimpleMultiplicities : ruleSimpleMultiplicities EOF ;
    public final void entryRuleSimpleMultiplicities() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:574:30: ( ruleSimpleMultiplicities EOF )
            // PsiInternalSequencerTestLanguage.g:575:2: ruleSimpleMultiplicities EOF
            {
             markComposite(elementTypeProvider.getSimpleMultiplicitiesElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSimpleMultiplicities();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleMultiplicities"


    // $ANTLR start "ruleSimpleMultiplicities"
    // PsiInternalSequencerTestLanguage.g:580:1: ruleSimpleMultiplicities : (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* ) ;
    public final void ruleSimpleMultiplicities() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token otherlv_2=null;
        Token lv_val2_3_0=null;
        Token otherlv_4=null;
        Token lv_val3_5_0=null;
        Token otherlv_6=null;
        Token lv_val4_7_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:580:25: ( (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* ) )
            // PsiInternalSequencerTestLanguage.g:581:2: (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* )
            {
            // PsiInternalSequencerTestLanguage.g:581:2: (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* )
            // PsiInternalSequencerTestLanguage.g:582:3: otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )*
            {

            			markLeaf(elementTypeProvider.getSimpleMultiplicities_NumberSignDigitThreeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:589:3: ( (lv_val1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:590:4: (lv_val1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:590:4: (lv_val1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:591:5: lv_val1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getSimpleMultiplicities_Val1IDTerminalRuleCall_1_0ElementType());
            				
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					doneLeaf(lv_val1_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getSimpleMultiplicities_Kw1Keyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSequencerTestLanguage.g:607:3: ( (lv_val2_3_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:608:4: (lv_val2_3_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:608:4: (lv_val2_3_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:609:5: lv_val2_3_0= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getSimpleMultiplicities_Val2IDTerminalRuleCall_3_0ElementType());
                    				
                    lv_val2_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

                    					doneLeaf(lv_val2_3_0);
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getSimpleMultiplicities_Kw2Keyword_4ElementType());
            		
            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalSequencerTestLanguage.g:625:3: ( (lv_val3_5_0= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:626:4: (lv_val3_5_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:626:4: (lv_val3_5_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:627:5: lv_val3_5_0= RULE_ID
            	    {

            	    					markLeaf(elementTypeProvider.getSimpleMultiplicities_Val3IDTerminalRuleCall_5_0ElementType());
            	    				
            	    lv_val3_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

            	    					doneLeaf(lv_val3_5_0);
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            			markLeaf(elementTypeProvider.getSimpleMultiplicities_Kw3Keyword_6ElementType());
            		
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalSequencerTestLanguage.g:643:3: ( (lv_val4_7_0= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:644:4: (lv_val4_7_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:644:4: (lv_val4_7_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:645:5: lv_val4_7_0= RULE_ID
            	    {

            	    					markLeaf(elementTypeProvider.getSimpleMultiplicities_Val4IDTerminalRuleCall_7_0ElementType());
            	    				
            	    lv_val4_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            	    					doneLeaf(lv_val4_7_0);
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSimpleMultiplicities"


    // $ANTLR start "entryRuleGroupMultiplicities"
    // PsiInternalSequencerTestLanguage.g:658:1: entryRuleGroupMultiplicities : ruleGroupMultiplicities EOF ;
    public final void entryRuleGroupMultiplicities() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:658:29: ( ruleGroupMultiplicities EOF )
            // PsiInternalSequencerTestLanguage.g:659:2: ruleGroupMultiplicities EOF
            {
             markComposite(elementTypeProvider.getGroupMultiplicitiesElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGroupMultiplicities();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupMultiplicities"


    // $ANTLR start "ruleGroupMultiplicities"
    // PsiInternalSequencerTestLanguage.g:664:1: ruleGroupMultiplicities : (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* ) ;
    public final void ruleGroupMultiplicities() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token otherlv_2=null;
        Token lv_val2_3_0=null;
        Token lv_val3_4_0=null;
        Token otherlv_5=null;
        Token lv_val4_6_0=null;
        Token lv_val5_7_0=null;
        Token otherlv_8=null;
        Token lv_val6_9_0=null;
        Token lv_val7_10_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:664:24: ( (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:665:2: (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* )
            {
            // PsiInternalSequencerTestLanguage.g:665:2: (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* )
            // PsiInternalSequencerTestLanguage.g:666:3: otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )*
            {

            			markLeaf(elementTypeProvider.getGroupMultiplicities_NumberSignDigitFourKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:673:3: ( (lv_val1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:674:4: (lv_val1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:674:4: (lv_val1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:675:5: lv_val1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGroupMultiplicities_Val1IDTerminalRuleCall_1_0ElementType());
            				
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					doneLeaf(lv_val1_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getGroupMultiplicities_Kw1Keyword_2ElementType());
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_6); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalSequencerTestLanguage.g:691:3: ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:692:4: ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:692:4: ( (lv_val2_3_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:693:5: (lv_val2_3_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:693:5: (lv_val2_3_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:694:6: lv_val2_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getGroupMultiplicities_Val2IDTerminalRuleCall_3_0_0ElementType());
                    					
                    lv_val2_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

                    						doneLeaf(lv_val2_3_0);
                    					

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:703:4: ( (lv_val3_4_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:704:5: (lv_val3_4_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:704:5: (lv_val3_4_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:705:6: lv_val3_4_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getGroupMultiplicities_Val3IDTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_val3_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

                    						doneLeaf(lv_val3_4_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getGroupMultiplicities_Kw2Keyword_4ElementType());
            		
            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalSequencerTestLanguage.g:722:3: ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:723:4: ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:723:4: ( (lv_val4_6_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:724:5: (lv_val4_6_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:724:5: (lv_val4_6_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:725:6: lv_val4_6_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getGroupMultiplicities_Val4IDTerminalRuleCall_5_0_0ElementType());
            	    					
            	    lv_val4_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            	    						doneLeaf(lv_val4_6_0);
            	    					

            	    }


            	    }

            	    // PsiInternalSequencerTestLanguage.g:734:4: ( (lv_val5_7_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:735:5: (lv_val5_7_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:735:5: (lv_val5_7_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:736:6: lv_val5_7_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getGroupMultiplicities_Val5IDTerminalRuleCall_5_1_0ElementType());
            	    					
            	    lv_val5_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

            	    						doneLeaf(lv_val5_7_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            			markLeaf(elementTypeProvider.getGroupMultiplicities_Kw3Keyword_6ElementType());
            		
            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            			doneLeaf(otherlv_8);
            		
            // PsiInternalSequencerTestLanguage.g:753:3: ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:754:4: ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:754:4: ( (lv_val6_9_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:755:5: (lv_val6_9_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:755:5: (lv_val6_9_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:756:6: lv_val6_9_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getGroupMultiplicities_Val6IDTerminalRuleCall_7_0_0ElementType());
            	    					
            	    lv_val6_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            	    						doneLeaf(lv_val6_9_0);
            	    					

            	    }


            	    }

            	    // PsiInternalSequencerTestLanguage.g:765:4: ( (lv_val7_10_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:766:5: (lv_val7_10_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:766:5: (lv_val7_10_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:767:6: lv_val7_10_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getGroupMultiplicities_Val7IDTerminalRuleCall_7_1_0ElementType());
            	    					
            	    lv_val7_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            	    						doneLeaf(lv_val7_10_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleGroupMultiplicities"


    // $ANTLR start "entryRuleAlternativeMultiplicities"
    // PsiInternalSequencerTestLanguage.g:781:1: entryRuleAlternativeMultiplicities : ruleAlternativeMultiplicities EOF ;
    public final void entryRuleAlternativeMultiplicities() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:781:35: ( ruleAlternativeMultiplicities EOF )
            // PsiInternalSequencerTestLanguage.g:782:2: ruleAlternativeMultiplicities EOF
            {
             markComposite(elementTypeProvider.getAlternativeMultiplicitiesElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAlternativeMultiplicities();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeMultiplicities"


    // $ANTLR start "ruleAlternativeMultiplicities"
    // PsiInternalSequencerTestLanguage.g:787:1: ruleAlternativeMultiplicities : (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* ) ;
    public final void ruleAlternativeMultiplicities() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val2_1_0=null;
        Token otherlv_2=null;
        Token lv_val3_3_0=null;
        Token otherlv_4=null;
        Token lv_val4_5_0=null;
        Token otherlv_6=null;
        Token lv_val5_7_0=null;
        Token otherlv_8=null;
        Token lv_val6_9_0=null;
        Token otherlv_10=null;
        Token lv_val7_11_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:787:30: ( (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:788:2: (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* )
            {
            // PsiInternalSequencerTestLanguage.g:788:2: (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* )
            // PsiInternalSequencerTestLanguage.g:789:3: otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )*
            {

            			markLeaf(elementTypeProvider.getAlternativeMultiplicities_NumberSignDigitFiveKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:796:3: ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:797:4: ( (lv_val2_1_0= RULE_ID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:797:4: ( (lv_val2_1_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:798:5: (lv_val2_1_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:798:5: (lv_val2_1_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:799:6: lv_val2_1_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getAlternativeMultiplicities_Val2IDTerminalRuleCall_1_0_0ElementType());
                    					
                    lv_val2_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

                    						doneLeaf(lv_val2_1_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:809:4: (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:809:4: (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:810:5: otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getAlternativeMultiplicities_Kw1Keyword_1_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_2);
                    				
                    // PsiInternalSequencerTestLanguage.g:817:5: ( (lv_val3_3_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:818:6: (lv_val3_3_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:818:6: (lv_val3_3_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:819:7: lv_val3_3_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAlternativeMultiplicities_Val3IDTerminalRuleCall_1_1_1_0ElementType());
                    						
                    lv_val3_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

                    							doneLeaf(lv_val3_3_0);
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAlternativeMultiplicities_Kw2Keyword_2ElementType());
            		
            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_8); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalSequencerTestLanguage.g:837:3: ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }
                else if ( (LA10_0==19) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:838:4: ( (lv_val4_5_0= RULE_ID ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:838:4: ( (lv_val4_5_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:839:5: (lv_val4_5_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:839:5: (lv_val4_5_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:840:6: lv_val4_5_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getAlternativeMultiplicities_Val4IDTerminalRuleCall_3_0_0ElementType());
            	    					
            	    lv_val4_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            	    						doneLeaf(lv_val4_5_0);
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:850:4: (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:850:4: (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:851:5: otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getAlternativeMultiplicities_Kw3Keyword_3_1_0ElementType());
            	    				
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	    					doneLeaf(otherlv_6);
            	    				
            	    // PsiInternalSequencerTestLanguage.g:858:5: ( (lv_val5_7_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:859:6: (lv_val5_7_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:859:6: (lv_val5_7_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:860:7: lv_val5_7_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getAlternativeMultiplicities_Val5IDTerminalRuleCall_3_1_1_0ElementType());
            	    						
            	    lv_val5_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            	    							doneLeaf(lv_val5_7_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            			markLeaf(elementTypeProvider.getAlternativeMultiplicities_Kw4Keyword_4ElementType());
            		
            otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_12); 

            			doneLeaf(otherlv_8);
            		
            // PsiInternalSequencerTestLanguage.g:878:3: ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }
                else if ( (LA11_0==23) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:879:4: ( (lv_val6_9_0= RULE_ID ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:879:4: ( (lv_val6_9_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:880:5: (lv_val6_9_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:880:5: (lv_val6_9_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:881:6: lv_val6_9_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getAlternativeMultiplicities_Val6IDTerminalRuleCall_5_0_0ElementType());
            	    					
            	    lv_val6_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            	    						doneLeaf(lv_val6_9_0);
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:891:4: (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:891:4: (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:892:5: otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getAlternativeMultiplicities_Kw5Keyword_5_1_0ElementType());
            	    				
            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            	    					doneLeaf(otherlv_10);
            	    				
            	    // PsiInternalSequencerTestLanguage.g:899:5: ( (lv_val7_11_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:900:6: (lv_val7_11_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:900:6: (lv_val7_11_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:901:7: lv_val7_11_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getAlternativeMultiplicities_Val7IDTerminalRuleCall_5_1_1_0ElementType());
            	    						
            	    lv_val7_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            	    							doneLeaf(lv_val7_11_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAlternativeMultiplicities"


    // $ANTLR start "entryRuleList1"
    // PsiInternalSequencerTestLanguage.g:916:1: entryRuleList1 : ruleList1 EOF ;
    public final void entryRuleList1() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:916:15: ( ruleList1 EOF )
            // PsiInternalSequencerTestLanguage.g:917:2: ruleList1 EOF
            {
             markComposite(elementTypeProvider.getList1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleList1();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList1"


    // $ANTLR start "ruleList1"
    // PsiInternalSequencerTestLanguage.g:922:1: ruleList1 : (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* ) ;
    public final void ruleList1() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token otherlv_2=null;
        Token lv_val1_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:922:10: ( (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:923:2: (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* )
            {
            // PsiInternalSequencerTestLanguage.g:923:2: (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* )
            // PsiInternalSequencerTestLanguage.g:924:3: otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )*
            {

            			markLeaf(elementTypeProvider.getList1_NumberSignDigitSixKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:931:3: ( (lv_val1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:932:4: (lv_val1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:932:4: (lv_val1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:933:5: lv_val1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getList1_Val1IDTerminalRuleCall_1_0ElementType());
            				
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            					doneLeaf(lv_val1_1_0);
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:942:3: (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:943:4: otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) )
            	    {

            	    				markLeaf(elementTypeProvider.getList1_CommaKeyword_2_0ElementType());
            	    			
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_3); 

            	    				doneLeaf(otherlv_2);
            	    			
            	    // PsiInternalSequencerTestLanguage.g:950:4: ( (lv_val1_3_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:951:5: (lv_val1_3_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:951:5: (lv_val1_3_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:952:6: lv_val1_3_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getList1_Val1IDTerminalRuleCall_2_1_0ElementType());
            	    					
            	    lv_val1_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            	    						doneLeaf(lv_val1_3_0);
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleList1"


    // $ANTLR start "entryRuleList2"
    // PsiInternalSequencerTestLanguage.g:966:1: entryRuleList2 : ruleList2 EOF ;
    public final void entryRuleList2() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:966:15: ( ruleList2 EOF )
            // PsiInternalSequencerTestLanguage.g:967:2: ruleList2 EOF
            {
             markComposite(elementTypeProvider.getList2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleList2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList2"


    // $ANTLR start "ruleList2"
    // PsiInternalSequencerTestLanguage.g:972:1: ruleList2 : (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? ) ;
    public final void ruleList2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_2_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:972:10: ( (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? ) )
            // PsiInternalSequencerTestLanguage.g:973:2: (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? )
            {
            // PsiInternalSequencerTestLanguage.g:973:2: (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? )
            // PsiInternalSequencerTestLanguage.g:974:3: otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )?
            {

            			markLeaf(elementTypeProvider.getList2_NumberSignDigitSevenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:981:3: ()
            // PsiInternalSequencerTestLanguage.g:982:4: 
            {

            				precedeComposite(elementTypeProvider.getList2_List2Action_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalSequencerTestLanguage.g:987:3: ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:988:4: ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )*
                    {
                    // PsiInternalSequencerTestLanguage.g:988:4: ( (lv_val1_2_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:989:5: (lv_val1_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:989:5: (lv_val1_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:990:6: lv_val1_2_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getList2_Val1IDTerminalRuleCall_2_0_0ElementType());
                    					
                    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

                    						doneLeaf(lv_val1_2_0);
                    					

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:999:4: (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // PsiInternalSequencerTestLanguage.g:1000:5: otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) )
                    	    {

                    	    					markLeaf(elementTypeProvider.getList2_CommaKeyword_2_1_0ElementType());
                    	    				
                    	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                    	    					doneLeaf(otherlv_3);
                    	    				
                    	    // PsiInternalSequencerTestLanguage.g:1007:5: ( (lv_val1_4_0= RULE_ID ) )
                    	    // PsiInternalSequencerTestLanguage.g:1008:6: (lv_val1_4_0= RULE_ID )
                    	    {
                    	    // PsiInternalSequencerTestLanguage.g:1008:6: (lv_val1_4_0= RULE_ID )
                    	    // PsiInternalSequencerTestLanguage.g:1009:7: lv_val1_4_0= RULE_ID
                    	    {

                    	    							markLeaf(elementTypeProvider.getList2_Val1IDTerminalRuleCall_2_1_1_0ElementType());
                    	    						
                    	    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

                    	    							doneLeaf(lv_val1_4_0);
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleList2"


    // $ANTLR start "entryRuleAltList1"
    // PsiInternalSequencerTestLanguage.g:1024:1: entryRuleAltList1 : ruleAltList1 EOF ;
    public final void entryRuleAltList1() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1024:18: ( ruleAltList1 EOF )
            // PsiInternalSequencerTestLanguage.g:1025:2: ruleAltList1 EOF
            {
             markComposite(elementTypeProvider.getAltList1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAltList1();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAltList1"


    // $ANTLR start "ruleAltList1"
    // PsiInternalSequencerTestLanguage.g:1030:1: ruleAltList1 : (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) ) ;
    public final void ruleAltList1() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val2_2_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;
        Token lv_val3_5_0=null;
        Token otherlv_6=null;
        Token lv_val1_7_0=null;
        Token lv_val4_8_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1030:13: ( (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1031:2: (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1031:2: (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) )
            // PsiInternalSequencerTestLanguage.g:1032:3: otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) )
            {

            			markLeaf(elementTypeProvider.getAltList1_NumberSignDigitEightKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_10); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1039:3: ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case 16:
                {
                alt16=2;
                }
                break;
            case 17:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1040:4: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1040:4: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:1041:5: ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1041:5: ( (lv_val1_1_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1042:6: (lv_val1_1_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1042:6: (lv_val1_1_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1043:7: lv_val1_1_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList1_Val1IDTerminalRuleCall_1_0_0_0ElementType());
                    						
                    lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

                    							doneLeaf(lv_val1_1_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1052:5: ( (lv_val2_2_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1053:6: (lv_val2_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1053:6: (lv_val2_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1054:7: lv_val2_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList1_Val2IDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_val2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_val2_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1065:4: (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1065:4: (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:1066:5: otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getAltList1_Kw1Keyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_3);
                    				
                    // PsiInternalSequencerTestLanguage.g:1073:5: ( (lv_val1_4_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1074:6: (lv_val1_4_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1074:6: (lv_val1_4_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1075:7: lv_val1_4_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList1_Val1IDTerminalRuleCall_1_1_1_0ElementType());
                    						
                    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

                    							doneLeaf(lv_val1_4_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1084:5: ( (lv_val3_5_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1085:6: (lv_val3_5_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1085:6: (lv_val3_5_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1086:7: lv_val3_5_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList1_Val3IDTerminalRuleCall_1_1_2_0ElementType());
                    						
                    lv_val3_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_val3_5_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1097:4: (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? )
                    {
                    // PsiInternalSequencerTestLanguage.g:1097:4: (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? )
                    // PsiInternalSequencerTestLanguage.g:1098:5: otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )?
                    {

                    					markLeaf(elementTypeProvider.getAltList1_Kw2Keyword_1_2_0ElementType());
                    				
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_6);
                    				
                    // PsiInternalSequencerTestLanguage.g:1105:5: ( (lv_val1_7_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1106:6: (lv_val1_7_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1106:6: (lv_val1_7_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1107:7: lv_val1_7_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList1_Val1IDTerminalRuleCall_1_2_1_0ElementType());
                    						
                    lv_val1_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

                    							doneLeaf(lv_val1_7_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1116:5: ( (lv_val4_8_0= RULE_ID ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // PsiInternalSequencerTestLanguage.g:1117:6: (lv_val4_8_0= RULE_ID )
                            {
                            // PsiInternalSequencerTestLanguage.g:1117:6: (lv_val4_8_0= RULE_ID )
                            // PsiInternalSequencerTestLanguage.g:1118:7: lv_val4_8_0= RULE_ID
                            {

                            							markLeaf(elementTypeProvider.getAltList1_Val4IDTerminalRuleCall_1_2_2_0ElementType());
                            						
                            lv_val4_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                            							doneLeaf(lv_val4_8_0);
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAltList1"


    // $ANTLR start "entryRuleAltList2"
    // PsiInternalSequencerTestLanguage.g:1133:1: entryRuleAltList2 : ruleAltList2 EOF ;
    public final void entryRuleAltList2() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1133:18: ( ruleAltList2 EOF )
            // PsiInternalSequencerTestLanguage.g:1134:2: ruleAltList2 EOF
            {
             markComposite(elementTypeProvider.getAltList2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAltList2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAltList2"


    // $ANTLR start "ruleAltList2"
    // PsiInternalSequencerTestLanguage.g:1139:1: ruleAltList2 : (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) ) ;
    public final void ruleAltList2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val2_2_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;
        Token otherlv_5=null;
        Token lv_val1_6_0=null;
        Token lv_val3_7_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1139:13: ( (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1140:2: (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1140:2: (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1141:3: otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) )
            {

            			markLeaf(elementTypeProvider.getAltList2_NumberSignDigitNineKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_14); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1148:3: ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1149:4: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1149:4: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:1150:5: ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1150:5: ( (lv_val1_1_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1151:6: (lv_val1_1_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1151:6: (lv_val1_1_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1152:7: lv_val1_1_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList2_Val1IDTerminalRuleCall_1_0_0_0ElementType());
                    						
                    lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

                    							doneLeaf(lv_val1_1_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1161:5: ( (lv_val2_2_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1162:6: (lv_val2_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1162:6: (lv_val2_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1163:7: lv_val2_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList2_Val2IDTerminalRuleCall_1_0_1_0ElementType());
                    						
                    lv_val2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_val2_2_0);
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1174:4: (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1174:4: (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) )
                    // PsiInternalSequencerTestLanguage.g:1175:5: otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) )
                    {

                    					markLeaf(elementTypeProvider.getAltList2_KwKeyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_3); 

                    					doneLeaf(otherlv_3);
                    				
                    // PsiInternalSequencerTestLanguage.g:1182:5: ( (lv_val1_4_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1183:6: (lv_val1_4_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1183:6: (lv_val1_4_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1184:7: lv_val1_4_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList2_Val1IDTerminalRuleCall_1_1_1_0ElementType());
                    						
                    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

                    							doneLeaf(lv_val1_4_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1193:5: (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // PsiInternalSequencerTestLanguage.g:1194:6: otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) )
                    	    {

                    	    						markLeaf(elementTypeProvider.getAltList2_CommaKeyword_1_1_2_0ElementType());
                    	    					
                    	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                    	    						doneLeaf(otherlv_5);
                    	    					
                    	    // PsiInternalSequencerTestLanguage.g:1201:6: ( (lv_val1_6_0= RULE_ID ) )
                    	    // PsiInternalSequencerTestLanguage.g:1202:7: (lv_val1_6_0= RULE_ID )
                    	    {
                    	    // PsiInternalSequencerTestLanguage.g:1202:7: (lv_val1_6_0= RULE_ID )
                    	    // PsiInternalSequencerTestLanguage.g:1203:8: lv_val1_6_0= RULE_ID
                    	    {

                    	    								markLeaf(elementTypeProvider.getAltList2_Val1IDTerminalRuleCall_1_1_2_1_0ElementType());
                    	    							
                    	    lv_val1_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); 

                    	    								doneLeaf(lv_val1_6_0);
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // PsiInternalSequencerTestLanguage.g:1213:5: ( (lv_val3_7_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1214:6: (lv_val3_7_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1214:6: (lv_val3_7_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1215:7: lv_val3_7_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getAltList2_Val3IDTerminalRuleCall_1_1_3_0ElementType());
                    						
                    lv_val3_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_val3_7_0);
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAltList2"


    // $ANTLR start "entryRuleSingleKeywords"
    // PsiInternalSequencerTestLanguage.g:1230:1: entryRuleSingleKeywords : ruleSingleKeywords EOF ;
    public final void entryRuleSingleKeywords() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1230:24: ( ruleSingleKeywords EOF )
            // PsiInternalSequencerTestLanguage.g:1231:2: ruleSingleKeywords EOF
            {
             markComposite(elementTypeProvider.getSingleKeywordsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleKeywords();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleKeywords"


    // $ANTLR start "ruleSingleKeywords"
    // PsiInternalSequencerTestLanguage.g:1236:1: ruleSingleKeywords : (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) ;
    public final void ruleSingleKeywords() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1236:19: ( (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1237:2: (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1237:2: (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1238:3: otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            {

            			markLeaf(elementTypeProvider.getSingleKeywords_NumberSignDigitOneDigitZeroKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1245:3: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            // PsiInternalSequencerTestLanguage.g:1246:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            {
            // PsiInternalSequencerTestLanguage.g:1246:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            // PsiInternalSequencerTestLanguage.g:1247:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            {
            // PsiInternalSequencerTestLanguage.g:1247:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt19=1;
                }
                break;
            case 17:
                {
                alt19=2;
                }
                break;
            case 19:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1248:6: lv_val_1_1= 'kw1'
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywords_ValKw1Keyword_1_0_0ElementType());
                    					
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1256:6: lv_val_1_2= 'kw2'
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywords_ValKw2Keyword_1_0_1ElementType());
                    					
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1264:6: lv_val_1_3= 'kw3'
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywords_ValKw3Keyword_1_0_2ElementType());
                    					
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_3);
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleKeywords"


    // $ANTLR start "entryRuleSingleKeywordsOrID"
    // PsiInternalSequencerTestLanguage.g:1278:1: entryRuleSingleKeywordsOrID : ruleSingleKeywordsOrID EOF ;
    public final void entryRuleSingleKeywordsOrID() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1278:28: ( ruleSingleKeywordsOrID EOF )
            // PsiInternalSequencerTestLanguage.g:1279:2: ruleSingleKeywordsOrID EOF
            {
             markComposite(elementTypeProvider.getSingleKeywordsOrIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleKeywordsOrID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleKeywordsOrID"


    // $ANTLR start "ruleSingleKeywordsOrID"
    // PsiInternalSequencerTestLanguage.g:1284:1: ruleSingleKeywordsOrID : (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) ;
    public final void ruleSingleKeywordsOrID() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;
        Token lv_val_1_4=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1284:23: ( (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1285:2: (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1285:2: (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1286:3: otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            {

            			markLeaf(elementTypeProvider.getSingleKeywordsOrID_NumberSignDigitOneDigitOneKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_17); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1293:3: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:1294:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            {
            // PsiInternalSequencerTestLanguage.g:1294:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:1295:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:1295:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt20=1;
                }
                break;
            case 17:
                {
                alt20=2;
                }
                break;
            case 19:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1296:6: lv_val_1_1= 'kw1'
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywordsOrID_ValKw1Keyword_1_0_0ElementType());
                    					
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1304:6: lv_val_1_2= 'kw2'
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywordsOrID_ValKw2Keyword_1_0_1ElementType());
                    					
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1312:6: lv_val_1_3= 'kw3'
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywordsOrID_ValKw3Keyword_1_0_2ElementType());
                    					
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_3);
                    					

                    }
                    break;
                case 4 :
                    // PsiInternalSequencerTestLanguage.g:1320:6: lv_val_1_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getSingleKeywordsOrID_ValIDTerminalRuleCall_1_0_3ElementType());
                    					
                    lv_val_1_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_4);
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleKeywordsOrID"


    // $ANTLR start "entryRuleSingleTerminals"
    // PsiInternalSequencerTestLanguage.g:1334:1: entryRuleSingleTerminals : ruleSingleTerminals EOF ;
    public final void entryRuleSingleTerminals() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1334:25: ( ruleSingleTerminals EOF )
            // PsiInternalSequencerTestLanguage.g:1335:2: ruleSingleTerminals EOF
            {
             markComposite(elementTypeProvider.getSingleTerminalsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleTerminals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleTerminals"


    // $ANTLR start "ruleSingleTerminals"
    // PsiInternalSequencerTestLanguage.g:1340:1: ruleSingleTerminals : (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) ;
    public final void ruleSingleTerminals() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1340:20: ( (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1341:2: (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1341:2: (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1342:3: otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            {

            			markLeaf(elementTypeProvider.getSingleTerminals_NumberSignDigitOneDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_18); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1349:3: ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            // PsiInternalSequencerTestLanguage.g:1350:4: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            {
            // PsiInternalSequencerTestLanguage.g:1350:4: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            // PsiInternalSequencerTestLanguage.g:1351:5: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            {
            // PsiInternalSequencerTestLanguage.g:1351:5: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID1) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID2) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1352:6: lv_val_1_1= RULE_ID1
                    {

                    						markLeaf(elementTypeProvider.getSingleTerminals_ValID1TerminalRuleCall_1_0_0ElementType());
                    					
                    lv_val_1_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1360:6: lv_val_1_2= RULE_ID2
                    {

                    						markLeaf(elementTypeProvider.getSingleTerminals_ValID2TerminalRuleCall_1_0_1ElementType());
                    					
                    lv_val_1_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_2);
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleTerminals"


    // $ANTLR start "entryRuleSingleEnum"
    // PsiInternalSequencerTestLanguage.g:1374:1: entryRuleSingleEnum : ruleSingleEnum EOF ;
    public final void entryRuleSingleEnum() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1374:20: ( ruleSingleEnum EOF )
            // PsiInternalSequencerTestLanguage.g:1375:2: ruleSingleEnum EOF
            {
             markComposite(elementTypeProvider.getSingleEnumElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleEnum();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleEnum"


    // $ANTLR start "ruleSingleEnum"
    // PsiInternalSequencerTestLanguage.g:1380:1: ruleSingleEnum : (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) ) ;
    public final void ruleSingleEnum() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1380:15: ( (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1381:2: (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1381:2: (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1382:3: otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) )
            {

            			markLeaf(elementTypeProvider.getSingleEnum_NumberSignDigitOneDigitThreeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1389:3: ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) )
            // PsiInternalSequencerTestLanguage.g:1390:4: ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) )
            {
            // PsiInternalSequencerTestLanguage.g:1390:4: ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) )
            // PsiInternalSequencerTestLanguage.g:1391:5: (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 )
            {
            // PsiInternalSequencerTestLanguage.g:1391:5: (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt22=1;
                }
                break;
            case 17:
                {
                alt22=2;
                }
                break;
            case 19:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1392:6: lv_val_1_1= ruleDefEnum1
                    {

                    						markComposite(elementTypeProvider.getSingleEnum_ValDefEnum1EnumRuleCall_1_0_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDefEnum1();

                    state._fsp--;


                    						doneComposite();
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1400:6: lv_val_1_2= ruleDefEnum2
                    {

                    						markComposite(elementTypeProvider.getSingleEnum_ValDefEnum2EnumRuleCall_1_0_1ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDefEnum2();

                    state._fsp--;


                    						doneComposite();
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1408:6: lv_val_1_3= ruleDefEnum3
                    {

                    						markComposite(elementTypeProvider.getSingleEnum_ValDefEnum3EnumRuleCall_1_0_2ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDefEnum3();

                    state._fsp--;


                    						doneComposite();
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleEnum"


    // $ANTLR start "entryRuleSingleCrossReference"
    // PsiInternalSequencerTestLanguage.g:1422:1: entryRuleSingleCrossReference : ruleSingleCrossReference EOF ;
    public final void entryRuleSingleCrossReference() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1422:30: ( ruleSingleCrossReference EOF )
            // PsiInternalSequencerTestLanguage.g:1423:2: ruleSingleCrossReference EOF
            {
             markComposite(elementTypeProvider.getSingleCrossReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleCrossReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleCrossReference"


    // $ANTLR start "ruleSingleCrossReference"
    // PsiInternalSequencerTestLanguage.g:1428:1: ruleSingleCrossReference : (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) ) ;
    public final void ruleSingleCrossReference() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1428:25: ( (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1429:2: (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1429:2: (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1430:3: otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) )
            {

            			markLeaf(elementTypeProvider.getSingleCrossReference_NumberSignDigitOneDigitFourKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_19); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1437:3: ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) )
            // PsiInternalSequencerTestLanguage.g:1438:4: ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) )
            {
            // PsiInternalSequencerTestLanguage.g:1438:4: ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) )
            // PsiInternalSequencerTestLanguage.g:1439:5: (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 )
            {
            // PsiInternalSequencerTestLanguage.g:1439:5: (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID1:
                {
                alt23=1;
                }
                break;
            case RULE_ID2:
                {
                alt23=2;
                }
                break;
            case RULE_ID3:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1440:6: lv_name_1_1= RULE_ID1
                    {

                    						markLeaf(elementTypeProvider.getSingleCrossReference_NameID1TerminalRuleCall_1_0_0ElementType());
                    					
                    lv_name_1_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_19); 

                    						doneLeaf(lv_name_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1448:6: lv_name_1_2= RULE_ID2
                    {

                    						markLeaf(elementTypeProvider.getSingleCrossReference_NameID2TerminalRuleCall_1_0_1ElementType());
                    					
                    lv_name_1_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_19); 

                    						doneLeaf(lv_name_1_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1456:6: lv_name_1_3= RULE_ID3
                    {

                    						markLeaf(elementTypeProvider.getSingleCrossReference_NameID3TerminalRuleCall_1_0_2ElementType());
                    					
                    lv_name_1_3=(Token)match(input,RULE_ID3,FollowSets000.FOLLOW_19); 

                    						doneLeaf(lv_name_1_3);
                    					

                    }
                    break;

            }


            }


            }

            // PsiInternalSequencerTestLanguage.g:1466:3: ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_ID1:
                {
                alt24=1;
                }
                break;
            case RULE_ID2:
                {
                alt24=2;
                }
                break;
            case RULE_ID3:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1467:4: ( (otherlv_2= RULE_ID1 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1467:4: ( (otherlv_2= RULE_ID1 ) )
                    // PsiInternalSequencerTestLanguage.g:1468:5: (otherlv_2= RULE_ID1 )
                    {
                    // PsiInternalSequencerTestLanguage.g:1468:5: (otherlv_2= RULE_ID1 )
                    // PsiInternalSequencerTestLanguage.g:1469:6: otherlv_2= RULE_ID1
                    {

                    						markLeaf(elementTypeProvider.getSingleCrossReference_RefSingleCrossReferenceCrossReference_2_0_0ElementType());
                    					
                    otherlv_2=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_2);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1479:4: ( (otherlv_3= RULE_ID2 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1479:4: ( (otherlv_3= RULE_ID2 ) )
                    // PsiInternalSequencerTestLanguage.g:1480:5: (otherlv_3= RULE_ID2 )
                    {
                    // PsiInternalSequencerTestLanguage.g:1480:5: (otherlv_3= RULE_ID2 )
                    // PsiInternalSequencerTestLanguage.g:1481:6: otherlv_3= RULE_ID2
                    {

                    						markLeaf(elementTypeProvider.getSingleCrossReference_RefSingleCrossReferenceCrossReference_2_1_0ElementType());
                    					
                    otherlv_3=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_3);
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1491:4: ( (otherlv_4= RULE_ID3 ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1491:4: ( (otherlv_4= RULE_ID3 ) )
                    // PsiInternalSequencerTestLanguage.g:1492:5: (otherlv_4= RULE_ID3 )
                    {
                    // PsiInternalSequencerTestLanguage.g:1492:5: (otherlv_4= RULE_ID3 )
                    // PsiInternalSequencerTestLanguage.g:1493:6: otherlv_4= RULE_ID3
                    {

                    						markLeaf(elementTypeProvider.getSingleCrossReference_RefSingleCrossReferenceCrossReference_2_2_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID3,FollowSets000.FOLLOW_2); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleCrossReference"


    // $ANTLR start "entryRuleSingleContainmentReference"
    // PsiInternalSequencerTestLanguage.g:1507:1: entryRuleSingleContainmentReference : ruleSingleContainmentReference EOF ;
    public final void entryRuleSingleContainmentReference() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1507:36: ( ruleSingleContainmentReference EOF )
            // PsiInternalSequencerTestLanguage.g:1508:2: ruleSingleContainmentReference EOF
            {
             markComposite(elementTypeProvider.getSingleContainmentReferenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleContainmentReference();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleContainmentReference"


    // $ANTLR start "ruleSingleContainmentReference"
    // PsiInternalSequencerTestLanguage.g:1513:1: ruleSingleContainmentReference : (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) ) ;
    public final void ruleSingleContainmentReference() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1513:31: ( (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1514:2: (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1514:2: (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1515:3: otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) )
            {

            			markLeaf(elementTypeProvider.getSingleContainmentReference_NumberSignDigitOneDigitFiveKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1522:3: ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) )
            // PsiInternalSequencerTestLanguage.g:1523:4: ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) )
            {
            // PsiInternalSequencerTestLanguage.g:1523:4: ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) )
            // PsiInternalSequencerTestLanguage.g:1524:5: (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 )
            {
            // PsiInternalSequencerTestLanguage.g:1524:5: (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt25=1;
                }
                break;
            case 17:
                {
                alt25=2;
                }
                break;
            case 19:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1525:6: lv_child_1_1= ruleSingleContainmentReferenceChild1
                    {

                    						markComposite(elementTypeProvider.getSingleContainmentReference_ChildSingleContainmentReferenceChild1ParserRuleCall_1_0_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleContainmentReferenceChild1();

                    state._fsp--;


                    						doneComposite();
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1533:6: lv_child_1_2= ruleSingleContainmentReferenceChild2
                    {

                    						markComposite(elementTypeProvider.getSingleContainmentReference_ChildSingleContainmentReferenceChild2ParserRuleCall_1_0_1ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleContainmentReferenceChild2();

                    state._fsp--;


                    						doneComposite();
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1541:6: lv_child_1_3= ruleSingleContainmentReferenceChild3
                    {

                    						markComposite(elementTypeProvider.getSingleContainmentReference_ChildSingleContainmentReferenceChild3ParserRuleCall_1_0_2ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSingleContainmentReferenceChild3();

                    state._fsp--;


                    						doneComposite();
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleContainmentReference"


    // $ANTLR start "entryRuleSingleContainmentReferenceChild1"
    // PsiInternalSequencerTestLanguage.g:1555:1: entryRuleSingleContainmentReferenceChild1 : ruleSingleContainmentReferenceChild1 EOF ;
    public final void entryRuleSingleContainmentReferenceChild1() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1555:42: ( ruleSingleContainmentReferenceChild1 EOF )
            // PsiInternalSequencerTestLanguage.g:1556:2: ruleSingleContainmentReferenceChild1 EOF
            {
             markComposite(elementTypeProvider.getSingleContainmentReferenceChild1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleContainmentReferenceChild1();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleContainmentReferenceChild1"


    // $ANTLR start "ruleSingleContainmentReferenceChild1"
    // PsiInternalSequencerTestLanguage.g:1561:1: ruleSingleContainmentReferenceChild1 : ( (lv_val_0_0= 'kw1' ) ) ;
    public final void ruleSingleContainmentReferenceChild1() throws RecognitionException {
        Token lv_val_0_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1561:37: ( ( (lv_val_0_0= 'kw1' ) ) )
            // PsiInternalSequencerTestLanguage.g:1562:2: ( (lv_val_0_0= 'kw1' ) )
            {
            // PsiInternalSequencerTestLanguage.g:1562:2: ( (lv_val_0_0= 'kw1' ) )
            // PsiInternalSequencerTestLanguage.g:1563:3: (lv_val_0_0= 'kw1' )
            {
            // PsiInternalSequencerTestLanguage.g:1563:3: (lv_val_0_0= 'kw1' )
            // PsiInternalSequencerTestLanguage.g:1564:4: lv_val_0_0= 'kw1'
            {

            				markLeaf(elementTypeProvider.getSingleContainmentReferenceChild1_ValKw1Keyword_0ElementType());
            			
            lv_val_0_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_val_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleContainmentReferenceChild1"


    // $ANTLR start "entryRuleSingleContainmentReferenceChild2"
    // PsiInternalSequencerTestLanguage.g:1576:1: entryRuleSingleContainmentReferenceChild2 : ruleSingleContainmentReferenceChild2 EOF ;
    public final void entryRuleSingleContainmentReferenceChild2() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1576:42: ( ruleSingleContainmentReferenceChild2 EOF )
            // PsiInternalSequencerTestLanguage.g:1577:2: ruleSingleContainmentReferenceChild2 EOF
            {
             markComposite(elementTypeProvider.getSingleContainmentReferenceChild2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleContainmentReferenceChild2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleContainmentReferenceChild2"


    // $ANTLR start "ruleSingleContainmentReferenceChild2"
    // PsiInternalSequencerTestLanguage.g:1582:1: ruleSingleContainmentReferenceChild2 : ( (lv_val_0_0= 'kw2' ) ) ;
    public final void ruleSingleContainmentReferenceChild2() throws RecognitionException {
        Token lv_val_0_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1582:37: ( ( (lv_val_0_0= 'kw2' ) ) )
            // PsiInternalSequencerTestLanguage.g:1583:2: ( (lv_val_0_0= 'kw2' ) )
            {
            // PsiInternalSequencerTestLanguage.g:1583:2: ( (lv_val_0_0= 'kw2' ) )
            // PsiInternalSequencerTestLanguage.g:1584:3: (lv_val_0_0= 'kw2' )
            {
            // PsiInternalSequencerTestLanguage.g:1584:3: (lv_val_0_0= 'kw2' )
            // PsiInternalSequencerTestLanguage.g:1585:4: lv_val_0_0= 'kw2'
            {

            				markLeaf(elementTypeProvider.getSingleContainmentReferenceChild2_ValKw2Keyword_0ElementType());
            			
            lv_val_0_0=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_val_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleContainmentReferenceChild2"


    // $ANTLR start "entryRuleSingleContainmentReferenceChild3"
    // PsiInternalSequencerTestLanguage.g:1597:1: entryRuleSingleContainmentReferenceChild3 : ruleSingleContainmentReferenceChild3 EOF ;
    public final void entryRuleSingleContainmentReferenceChild3() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1597:42: ( ruleSingleContainmentReferenceChild3 EOF )
            // PsiInternalSequencerTestLanguage.g:1598:2: ruleSingleContainmentReferenceChild3 EOF
            {
             markComposite(elementTypeProvider.getSingleContainmentReferenceChild3ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSingleContainmentReferenceChild3();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleContainmentReferenceChild3"


    // $ANTLR start "ruleSingleContainmentReferenceChild3"
    // PsiInternalSequencerTestLanguage.g:1603:1: ruleSingleContainmentReferenceChild3 : ( (lv_val_0_0= 'kw3' ) ) ;
    public final void ruleSingleContainmentReferenceChild3() throws RecognitionException {
        Token lv_val_0_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1603:37: ( ( (lv_val_0_0= 'kw3' ) ) )
            // PsiInternalSequencerTestLanguage.g:1604:2: ( (lv_val_0_0= 'kw3' ) )
            {
            // PsiInternalSequencerTestLanguage.g:1604:2: ( (lv_val_0_0= 'kw3' ) )
            // PsiInternalSequencerTestLanguage.g:1605:3: (lv_val_0_0= 'kw3' )
            {
            // PsiInternalSequencerTestLanguage.g:1605:3: (lv_val_0_0= 'kw3' )
            // PsiInternalSequencerTestLanguage.g:1606:4: lv_val_0_0= 'kw3'
            {

            				markLeaf(elementTypeProvider.getSingleContainmentReferenceChild3_ValKw3Keyword_0ElementType());
            			
            lv_val_0_0=(Token)match(input,19,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_val_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSingleContainmentReferenceChild3"


    // $ANTLR start "entryRuleMultiKeywords"
    // PsiInternalSequencerTestLanguage.g:1618:1: entryRuleMultiKeywords : ruleMultiKeywords EOF ;
    public final void entryRuleMultiKeywords() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1618:23: ( ruleMultiKeywords EOF )
            // PsiInternalSequencerTestLanguage.g:1619:2: ruleMultiKeywords EOF
            {
             markComposite(elementTypeProvider.getMultiKeywordsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiKeywords();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiKeywords"


    // $ANTLR start "ruleMultiKeywords"
    // PsiInternalSequencerTestLanguage.g:1624:1: ruleMultiKeywords : (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) ;
    public final void ruleMultiKeywords() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1624:18: ( (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1625:2: (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1625:2: (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1626:3: otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            {

            			markLeaf(elementTypeProvider.getMultiKeywords_NumberSignDigitOneDigitSixKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1633:3: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            // PsiInternalSequencerTestLanguage.g:1634:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            {
            // PsiInternalSequencerTestLanguage.g:1634:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            // PsiInternalSequencerTestLanguage.g:1635:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            {
            // PsiInternalSequencerTestLanguage.g:1635:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case 17:
                {
                alt26=2;
                }
                break;
            case 19:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1636:6: lv_val_1_1= 'kw1'
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywords_ValKw1Keyword_1_0_0ElementType());
                    					
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1644:6: lv_val_1_2= 'kw2'
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywords_ValKw2Keyword_1_0_1ElementType());
                    					
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1652:6: lv_val_1_3= 'kw3'
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywords_ValKw3Keyword_1_0_2ElementType());
                    					
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_3);
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleMultiKeywords"


    // $ANTLR start "entryRuleMultiKeywordsOrID"
    // PsiInternalSequencerTestLanguage.g:1666:1: entryRuleMultiKeywordsOrID : ruleMultiKeywordsOrID EOF ;
    public final void entryRuleMultiKeywordsOrID() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1666:27: ( ruleMultiKeywordsOrID EOF )
            // PsiInternalSequencerTestLanguage.g:1667:2: ruleMultiKeywordsOrID EOF
            {
             markComposite(elementTypeProvider.getMultiKeywordsOrIDElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiKeywordsOrID();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiKeywordsOrID"


    // $ANTLR start "ruleMultiKeywordsOrID"
    // PsiInternalSequencerTestLanguage.g:1672:1: ruleMultiKeywordsOrID : (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) ;
    public final void ruleMultiKeywordsOrID() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;
        Token lv_val_1_4=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1672:22: ( (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1673:2: (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1673:2: (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1674:3: otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            {

            			markLeaf(elementTypeProvider.getMultiKeywordsOrID_NumberSignDigitOneDigitSevenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_17); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1681:3: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:1682:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            {
            // PsiInternalSequencerTestLanguage.g:1682:4: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:1683:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:1683:5: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt27=1;
                }
                break;
            case 17:
                {
                alt27=2;
                }
                break;
            case 19:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1684:6: lv_val_1_1= 'kw1'
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywordsOrID_ValKw1Keyword_1_0_0ElementType());
                    					
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1692:6: lv_val_1_2= 'kw2'
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywordsOrID_ValKw2Keyword_1_0_1ElementType());
                    					
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_2);
                    					

                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:1700:6: lv_val_1_3= 'kw3'
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywordsOrID_ValKw3Keyword_1_0_2ElementType());
                    					
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_3);
                    					

                    }
                    break;
                case 4 :
                    // PsiInternalSequencerTestLanguage.g:1708:6: lv_val_1_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getMultiKeywordsOrID_ValIDTerminalRuleCall_1_0_3ElementType());
                    					
                    lv_val_1_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_4);
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleMultiKeywordsOrID"


    // $ANTLR start "entryRuleMultiTerminals"
    // PsiInternalSequencerTestLanguage.g:1722:1: entryRuleMultiTerminals : ruleMultiTerminals EOF ;
    public final void entryRuleMultiTerminals() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1722:24: ( ruleMultiTerminals EOF )
            // PsiInternalSequencerTestLanguage.g:1723:2: ruleMultiTerminals EOF
            {
             markComposite(elementTypeProvider.getMultiTerminalsElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiTerminals();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiTerminals"


    // $ANTLR start "ruleMultiTerminals"
    // PsiInternalSequencerTestLanguage.g:1728:1: ruleMultiTerminals : (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) ;
    public final void ruleMultiTerminals() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1728:19: ( (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1729:2: (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1729:2: (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1730:3: otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            {

            			markLeaf(elementTypeProvider.getMultiTerminals_NumberSignDigitOneDigitEightKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_18); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1737:3: ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            // PsiInternalSequencerTestLanguage.g:1738:4: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            {
            // PsiInternalSequencerTestLanguage.g:1738:4: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            // PsiInternalSequencerTestLanguage.g:1739:5: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            {
            // PsiInternalSequencerTestLanguage.g:1739:5: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID1) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID2) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1740:6: lv_val_1_1= RULE_ID1
                    {

                    						markLeaf(elementTypeProvider.getMultiTerminals_ValID1TerminalRuleCall_1_0_0ElementType());
                    					
                    lv_val_1_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_1);
                    					

                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1748:6: lv_val_1_2= RULE_ID2
                    {

                    						markLeaf(elementTypeProvider.getMultiTerminals_ValID2TerminalRuleCall_1_0_1ElementType());
                    					
                    lv_val_1_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_2);
                    					

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleMultiTerminals"


    // $ANTLR start "entryRuleDependentAlternative1"
    // PsiInternalSequencerTestLanguage.g:1762:1: entryRuleDependentAlternative1 : ruleDependentAlternative1 EOF ;
    public final void entryRuleDependentAlternative1() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1762:31: ( ruleDependentAlternative1 EOF )
            // PsiInternalSequencerTestLanguage.g:1763:2: ruleDependentAlternative1 EOF
            {
             markComposite(elementTypeProvider.getDependentAlternative1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDependentAlternative1();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependentAlternative1"


    // $ANTLR start "ruleDependentAlternative1"
    // PsiInternalSequencerTestLanguage.g:1768:1: ruleDependentAlternative1 : (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) ) ;
    public final void ruleDependentAlternative1() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_0=null;
        Token lv_val_2_0=null;
        Token lv_flag_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1768:26: ( (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1769:2: (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1769:2: (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1770:3: otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) )
            {

            			markLeaf(elementTypeProvider.getDependentAlternative1_NumberSignDigitOneDigitNineKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1777:3: ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==EOF) ) {
                    alt29=1;
                }
                else if ( (LA29_1==16) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1778:4: ( (lv_val_1_0= RULE_ID ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1778:4: ( (lv_val_1_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1779:5: (lv_val_1_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1779:5: (lv_val_1_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1780:6: lv_val_1_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getDependentAlternative1_ValIDTerminalRuleCall_1_0_0ElementType());
                    					
                    lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_val_1_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1790:4: ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1790:4: ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) )
                    // PsiInternalSequencerTestLanguage.g:1791:5: ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1791:5: ( (lv_val_2_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1792:6: (lv_val_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1792:6: (lv_val_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1793:7: lv_val_2_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getDependentAlternative1_ValIDTerminalRuleCall_1_1_0_0ElementType());
                    						
                    lv_val_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

                    							doneLeaf(lv_val_2_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1802:5: ( (lv_flag_3_0= 'kw1' ) )
                    // PsiInternalSequencerTestLanguage.g:1803:6: (lv_flag_3_0= 'kw1' )
                    {
                    // PsiInternalSequencerTestLanguage.g:1803:6: (lv_flag_3_0= 'kw1' )
                    // PsiInternalSequencerTestLanguage.g:1804:7: lv_flag_3_0= 'kw1'
                    {

                    							markLeaf(elementTypeProvider.getDependentAlternative1_FlagKw1Keyword_1_1_1_0ElementType());
                    						
                    lv_flag_3_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_flag_3_0);
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDependentAlternative1"


    // $ANTLR start "entryRuleDependentAlternative2"
    // PsiInternalSequencerTestLanguage.g:1819:1: entryRuleDependentAlternative2 : ruleDependentAlternative2 EOF ;
    public final void entryRuleDependentAlternative2() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1819:31: ( ruleDependentAlternative2 EOF )
            // PsiInternalSequencerTestLanguage.g:1820:2: ruleDependentAlternative2 EOF
            {
             markComposite(elementTypeProvider.getDependentAlternative2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDependentAlternative2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependentAlternative2"


    // $ANTLR start "ruleDependentAlternative2"
    // PsiInternalSequencerTestLanguage.g:1825:1: ruleDependentAlternative2 : (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) ) ;
    public final void ruleDependentAlternative2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_0=null;
        Token lv_val_2_0=null;
        Token lv_val_3_0=null;
        Token lv_flag_4_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1825:26: ( (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1826:2: (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:1826:2: (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:1827:3: otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) )
            {

            			markLeaf(elementTypeProvider.getDependentAlternative2_NumberSignDigitTwoDigitZeroKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1834:3: ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1835:4: ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ )
                    {
                    // PsiInternalSequencerTestLanguage.g:1835:4: ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ )
                    // PsiInternalSequencerTestLanguage.g:1836:5: ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+
                    {
                    // PsiInternalSequencerTestLanguage.g:1836:5: ( (lv_val_1_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:1837:6: (lv_val_1_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:1837:6: (lv_val_1_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:1838:7: lv_val_1_0= RULE_ID
                    {

                    							markLeaf(elementTypeProvider.getDependentAlternative2_ValIDTerminalRuleCall_1_0_0_0ElementType());
                    						
                    lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

                    							doneLeaf(lv_val_1_0);
                    						

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1847:5: ( (lv_val_2_0= RULE_ID ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // PsiInternalSequencerTestLanguage.g:1848:6: (lv_val_2_0= RULE_ID )
                    	    {
                    	    // PsiInternalSequencerTestLanguage.g:1848:6: (lv_val_2_0= RULE_ID )
                    	    // PsiInternalSequencerTestLanguage.g:1849:7: lv_val_2_0= RULE_ID
                    	    {

                    	    							markLeaf(elementTypeProvider.getDependentAlternative2_ValIDTerminalRuleCall_1_0_1_0ElementType());
                    	    						
                    	    lv_val_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

                    	    							doneLeaf(lv_val_2_0);
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:1860:4: ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1860:4: ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) )
                    // PsiInternalSequencerTestLanguage.g:1861:5: ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1861:5: ( (lv_val_3_0= RULE_ID ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // PsiInternalSequencerTestLanguage.g:1862:6: (lv_val_3_0= RULE_ID )
                    	    {
                    	    // PsiInternalSequencerTestLanguage.g:1862:6: (lv_val_3_0= RULE_ID )
                    	    // PsiInternalSequencerTestLanguage.g:1863:7: lv_val_3_0= RULE_ID
                    	    {

                    	    							markLeaf(elementTypeProvider.getDependentAlternative2_ValIDTerminalRuleCall_1_1_0_0ElementType());
                    	    						
                    	    lv_val_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

                    	    							doneLeaf(lv_val_3_0);
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // PsiInternalSequencerTestLanguage.g:1872:5: ( (lv_flag_4_0= 'kw1' ) )
                    // PsiInternalSequencerTestLanguage.g:1873:6: (lv_flag_4_0= 'kw1' )
                    {
                    // PsiInternalSequencerTestLanguage.g:1873:6: (lv_flag_4_0= 'kw1' )
                    // PsiInternalSequencerTestLanguage.g:1874:7: lv_flag_4_0= 'kw1'
                    {

                    							markLeaf(elementTypeProvider.getDependentAlternative2_FlagKw1Keyword_1_1_1_0ElementType());
                    						
                    lv_flag_4_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    							doneLeaf(lv_flag_4_0);
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDependentAlternative2"


    // $ANTLR start "entryRuleOptional"
    // PsiInternalSequencerTestLanguage.g:1889:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1889:18: ( ruleOptional EOF )
            // PsiInternalSequencerTestLanguage.g:1890:2: ruleOptional EOF
            {
             markComposite(elementTypeProvider.getOptionalElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOptional();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // PsiInternalSequencerTestLanguage.g:1895:1: ruleOptional : (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? ) ;
    public final void ruleOptional() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_int0_1_0=null;
        Token lv_int1_2_0=null;
        Token lv_int2_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1895:13: ( (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? ) )
            // PsiInternalSequencerTestLanguage.g:1896:2: (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? )
            {
            // PsiInternalSequencerTestLanguage.g:1896:2: (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? )
            // PsiInternalSequencerTestLanguage.g:1897:3: otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )?
            {

            			markLeaf(elementTypeProvider.getOptional_NumberSignDigitTwoDigitOneKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_21); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1904:3: ( (lv_int0_1_0= RULE_INT ) )
            // PsiInternalSequencerTestLanguage.g:1905:4: (lv_int0_1_0= RULE_INT )
            {
            // PsiInternalSequencerTestLanguage.g:1905:4: (lv_int0_1_0= RULE_INT )
            // PsiInternalSequencerTestLanguage.g:1906:5: lv_int0_1_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getOptional_Int0INTTerminalRuleCall_1_0ElementType());
            				
            lv_int0_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_22); 

            					doneLeaf(lv_int0_1_0);
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:1915:3: ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:1916:4: ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:1916:4: ( (lv_int1_2_0= RULE_INT ) )
                    // PsiInternalSequencerTestLanguage.g:1917:5: (lv_int1_2_0= RULE_INT )
                    {
                    // PsiInternalSequencerTestLanguage.g:1917:5: (lv_int1_2_0= RULE_INT )
                    // PsiInternalSequencerTestLanguage.g:1918:6: lv_int1_2_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getOptional_Int1INTTerminalRuleCall_2_0_0ElementType());
                    					
                    lv_int1_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_21); 

                    						doneLeaf(lv_int1_2_0);
                    					

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:1927:4: ( (lv_int2_3_0= RULE_INT ) )
                    // PsiInternalSequencerTestLanguage.g:1928:5: (lv_int2_3_0= RULE_INT )
                    {
                    // PsiInternalSequencerTestLanguage.g:1928:5: (lv_int2_3_0= RULE_INT )
                    // PsiInternalSequencerTestLanguage.g:1929:6: lv_int2_3_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getOptional_Int2INTTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_int2_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_int2_3_0);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleFloat"
    // PsiInternalSequencerTestLanguage.g:1943:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1943:15: ( ruleFloat EOF )
            // PsiInternalSequencerTestLanguage.g:1944:2: ruleFloat EOF
            {
             markComposite(elementTypeProvider.getFloatElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFloat();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // PsiInternalSequencerTestLanguage.g:1949:1: ruleFloat : (otherlv_0= '#22' () otherlv_2= 'Bye' ) ;
    public final void ruleFloat() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1949:10: ( (otherlv_0= '#22' () otherlv_2= 'Bye' ) )
            // PsiInternalSequencerTestLanguage.g:1950:2: (otherlv_0= '#22' () otherlv_2= 'Bye' )
            {
            // PsiInternalSequencerTestLanguage.g:1950:2: (otherlv_0= '#22' () otherlv_2= 'Bye' )
            // PsiInternalSequencerTestLanguage.g:1951:3: otherlv_0= '#22' () otherlv_2= 'Bye'
            {

            			markLeaf(elementTypeProvider.getFloat_NumberSignDigitTwoDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_23); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1958:3: ()
            // PsiInternalSequencerTestLanguage.g:1959:4: 
            {

            				precedeComposite(elementTypeProvider.getFloat_FloatAction_1ElementType());
            				doneComposite();
            			

            }


            			markLeaf(elementTypeProvider.getFloat_ByeKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_2); 

            			doneLeaf(otherlv_2);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleUnorderedAlternative"
    // PsiInternalSequencerTestLanguage.g:1975:1: entryRuleUnorderedAlternative : ruleUnorderedAlternative EOF ;
    public final void entryRuleUnorderedAlternative() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:1975:30: ( ruleUnorderedAlternative EOF )
            // PsiInternalSequencerTestLanguage.g:1976:2: ruleUnorderedAlternative EOF
            {
             markComposite(elementTypeProvider.getUnorderedAlternativeElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedAlternative();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedAlternative"


    // $ANTLR start "ruleUnorderedAlternative"
    // PsiInternalSequencerTestLanguage.g:1981:1: ruleUnorderedAlternative : (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* ) ;
    public final void ruleUnorderedAlternative() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_2_0=null;
        Token lv_val2_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:1981:25: ( (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:1982:2: (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* )
            {
            // PsiInternalSequencerTestLanguage.g:1982:2: (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* )
            // PsiInternalSequencerTestLanguage.g:1983:3: otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )*
            {

            			markLeaf(elementTypeProvider.getUnorderedAlternative_NumberSignDigitTwoDigitThreeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_24); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:1990:3: ()
            // PsiInternalSequencerTestLanguage.g:1991:4: 
            {

            				precedeComposite(elementTypeProvider.getUnorderedAlternative_UnorderedAlternativeAction_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalSequencerTestLanguage.g:1996:3: ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )*
            loop34:
            do {
                int alt34=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt34=2;
                    }
                    break;
                case 16:
                    {
                    alt34=3;
                    }
                    break;
                case 17:
                    {
                    alt34=4;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:1997:4: ( (lv_val1_2_0= RULE_ID ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:1997:4: ( (lv_val1_2_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:1998:5: (lv_val1_2_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:1998:5: (lv_val1_2_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:1999:6: lv_val1_2_0= RULE_ID
            	    {

            	    						markLeaf(elementTypeProvider.getUnorderedAlternative_Val1IDTerminalRuleCall_2_0_0ElementType());
            	    					
            	    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            	    						doneLeaf(lv_val1_2_0);
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:2009:4: ( (lv_val2_3_0= RULE_INT ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2009:4: ( (lv_val2_3_0= RULE_INT ) )
            	    // PsiInternalSequencerTestLanguage.g:2010:5: (lv_val2_3_0= RULE_INT )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2010:5: (lv_val2_3_0= RULE_INT )
            	    // PsiInternalSequencerTestLanguage.g:2011:6: lv_val2_3_0= RULE_INT
            	    {

            	    						markLeaf(elementTypeProvider.getUnorderedAlternative_Val2INTTerminalRuleCall_2_1_0ElementType());
            	    					
            	    lv_val2_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_24); 

            	    						doneLeaf(lv_val2_3_0);
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalSequencerTestLanguage.g:2021:4: ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2021:4: ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) )
            	    // PsiInternalSequencerTestLanguage.g:2022:5: (lv_val3_4_0= ruleUnorderedAlternativeVal )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2022:5: (lv_val3_4_0= ruleUnorderedAlternativeVal )
            	    // PsiInternalSequencerTestLanguage.g:2023:6: lv_val3_4_0= ruleUnorderedAlternativeVal
            	    {

            	    						markComposite(elementTypeProvider.getUnorderedAlternative_Val3UnorderedAlternativeValParserRuleCall_2_2_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    ruleUnorderedAlternativeVal();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalSequencerTestLanguage.g:2033:4: ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2033:4: ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) )
            	    // PsiInternalSequencerTestLanguage.g:2034:5: (lv_val4_5_0= ruleUnorderedAlternativeValDelegate )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2034:5: (lv_val4_5_0= ruleUnorderedAlternativeValDelegate )
            	    // PsiInternalSequencerTestLanguage.g:2035:6: lv_val4_5_0= ruleUnorderedAlternativeValDelegate
            	    {

            	    						markComposite(elementTypeProvider.getUnorderedAlternative_Val4UnorderedAlternativeValDelegateParserRuleCall_2_3_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    ruleUnorderedAlternativeValDelegate();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedAlternative"


    // $ANTLR start "entryRuleUnorderedAlternativeVal"
    // PsiInternalSequencerTestLanguage.g:2049:1: entryRuleUnorderedAlternativeVal : ruleUnorderedAlternativeVal EOF ;
    public final void entryRuleUnorderedAlternativeVal() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2049:33: ( ruleUnorderedAlternativeVal EOF )
            // PsiInternalSequencerTestLanguage.g:2050:2: ruleUnorderedAlternativeVal EOF
            {
             markComposite(elementTypeProvider.getUnorderedAlternativeValElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedAlternativeVal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedAlternativeVal"


    // $ANTLR start "ruleUnorderedAlternativeVal"
    // PsiInternalSequencerTestLanguage.g:2055:1: ruleUnorderedAlternativeVal : (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final void ruleUnorderedAlternativeVal() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2055:28: ( (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2056:2: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2056:2: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2057:3: otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedAlternativeVal_Kw1Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2064:3: ( (lv_val_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2065:4: (lv_val_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2065:4: (lv_val_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2066:5: lv_val_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUnorderedAlternativeVal_ValIDTerminalRuleCall_1_0ElementType());
            				
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_val_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedAlternativeVal"


    // $ANTLR start "entryRuleUnorderedAlternativeValDelegate"
    // PsiInternalSequencerTestLanguage.g:2079:1: entryRuleUnorderedAlternativeValDelegate : ruleUnorderedAlternativeValDelegate EOF ;
    public final void entryRuleUnorderedAlternativeValDelegate() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2079:41: ( ruleUnorderedAlternativeValDelegate EOF )
            // PsiInternalSequencerTestLanguage.g:2080:2: ruleUnorderedAlternativeValDelegate EOF
            {
             markComposite(elementTypeProvider.getUnorderedAlternativeValDelegateElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedAlternativeValDelegate();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedAlternativeValDelegate"


    // $ANTLR start "ruleUnorderedAlternativeValDelegate"
    // PsiInternalSequencerTestLanguage.g:2085:1: ruleUnorderedAlternativeValDelegate : ruleUnorderedAlternativeVal2 ;
    public final void ruleUnorderedAlternativeValDelegate() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2085:36: ( ruleUnorderedAlternativeVal2 )
            // PsiInternalSequencerTestLanguage.g:2086:2: ruleUnorderedAlternativeVal2
            {

            		markComposite(elementTypeProvider.getUnorderedAlternativeValDelegate_UnorderedAlternativeVal2ParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnorderedAlternativeVal2();

            state._fsp--;


            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedAlternativeValDelegate"


    // $ANTLR start "entryRuleUnorderedAlternativeVal2"
    // PsiInternalSequencerTestLanguage.g:2096:1: entryRuleUnorderedAlternativeVal2 : ruleUnorderedAlternativeVal2 EOF ;
    public final void entryRuleUnorderedAlternativeVal2() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2096:34: ( ruleUnorderedAlternativeVal2 EOF )
            // PsiInternalSequencerTestLanguage.g:2097:2: ruleUnorderedAlternativeVal2 EOF
            {
             markComposite(elementTypeProvider.getUnorderedAlternativeVal2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedAlternativeVal2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedAlternativeVal2"


    // $ANTLR start "ruleUnorderedAlternativeVal2"
    // PsiInternalSequencerTestLanguage.g:2102:1: ruleUnorderedAlternativeVal2 : (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final void ruleUnorderedAlternativeVal2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2102:29: ( (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2103:2: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2103:2: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2104:3: otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedAlternativeVal2_Kw2Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2111:3: ( (lv_val_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2112:4: (lv_val_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2112:4: (lv_val_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2113:5: lv_val_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUnorderedAlternativeVal2_ValIDTerminalRuleCall_1_0ElementType());
            				
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_val_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedAlternativeVal2"


    // $ANTLR start "entryRuleUnorderedGroup"
    // PsiInternalSequencerTestLanguage.g:2126:1: entryRuleUnorderedGroup : ruleUnorderedGroup EOF ;
    public final void entryRuleUnorderedGroup() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2126:24: ( ruleUnorderedGroup EOF )
            // PsiInternalSequencerTestLanguage.g:2127:2: ruleUnorderedGroup EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroup();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // PsiInternalSequencerTestLanguage.g:2132:1: ruleUnorderedGroup : (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final void ruleUnorderedGroup() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_2_0=null;
        Token lv_val2_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2132:19: ( (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2133:2: (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2133:2: (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) )
            // PsiInternalSequencerTestLanguage.g:2134:3: otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedGroup_NumberSignDigitTwoDigitFourKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_25); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2141:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) )
            // PsiInternalSequencerTestLanguage.g:2142:4: ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) )
            {
            // PsiInternalSequencerTestLanguage.g:2142:4: ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) )
            // PsiInternalSequencerTestLanguage.g:2143:5: ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            				
            // PsiInternalSequencerTestLanguage.g:2146:5: ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?)
            // PsiInternalSequencerTestLanguage.g:2147:6: ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?
            {
            // PsiInternalSequencerTestLanguage.g:2147:6: ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=5;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == RULE_INT && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt35=3;
                }
                else if ( LA35_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt35=4;
                }


                switch (alt35) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:2148:4: ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2148:4: ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2149:5: {...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2149:111: ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2150:6: ({...}? => ( (lv_val1_2_0= RULE_ID ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2153:9: ({...}? => ( (lv_val1_2_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2153:10: {...}? => ( (lv_val1_2_0= RULE_ID ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2153:19: ( (lv_val1_2_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2153:20: (lv_val1_2_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2153:20: (lv_val1_2_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2154:10: lv_val1_2_0= RULE_ID
            	    {

            	    										markLeaf(elementTypeProvider.getUnorderedGroup_Val1IDTerminalRuleCall_1_0_0ElementType());
            	    									
            	    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            	    										doneLeaf(lv_val1_2_0);
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:2168:4: ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2168:4: ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2169:5: {...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2169:111: ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2170:6: ({...}? => ( (lv_val2_3_0= RULE_INT ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2173:9: ({...}? => ( (lv_val2_3_0= RULE_INT ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2173:10: {...}? => ( (lv_val2_3_0= RULE_INT ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2173:19: ( (lv_val2_3_0= RULE_INT ) )
            	    // PsiInternalSequencerTestLanguage.g:2173:20: (lv_val2_3_0= RULE_INT )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2173:20: (lv_val2_3_0= RULE_INT )
            	    // PsiInternalSequencerTestLanguage.g:2174:10: lv_val2_3_0= RULE_INT
            	    {

            	    										markLeaf(elementTypeProvider.getUnorderedGroup_Val2INTTerminalRuleCall_1_1_0ElementType());
            	    									
            	    lv_val2_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_24); 

            	    										doneLeaf(lv_val2_3_0);
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalSequencerTestLanguage.g:2188:4: ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2188:4: ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2189:5: {...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2189:111: ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2190:6: ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2193:9: ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2193:10: {...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2193:19: ( (lv_val3_4_0= ruleUnorderedGroupVal ) )
            	    // PsiInternalSequencerTestLanguage.g:2193:20: (lv_val3_4_0= ruleUnorderedGroupVal )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2193:20: (lv_val3_4_0= ruleUnorderedGroupVal )
            	    // PsiInternalSequencerTestLanguage.g:2194:10: lv_val3_4_0= ruleUnorderedGroupVal
            	    {

            	    										markComposite(elementTypeProvider.getUnorderedGroup_Val3UnorderedGroupValParserRuleCall_1_2_0ElementType());
            	    									
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    ruleUnorderedGroupVal();

            	    state._fsp--;


            	    										doneComposite();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalSequencerTestLanguage.g:2208:4: ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2208:4: ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2209:5: {...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2209:111: ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2210:6: ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2213:9: ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2213:10: {...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2213:19: ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) )
            	    // PsiInternalSequencerTestLanguage.g:2213:20: (lv_val4_5_0= ruleUnorderedGroupValDelegate )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2213:20: (lv_val4_5_0= ruleUnorderedGroupValDelegate )
            	    // PsiInternalSequencerTestLanguage.g:2214:10: lv_val4_5_0= ruleUnorderedGroupValDelegate
            	    {

            	    										markComposite(elementTypeProvider.getUnorderedGroup_Val4UnorderedGroupValDelegateParserRuleCall_1_3_0ElementType());
            	    									
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    ruleUnorderedGroupValDelegate();

            	    state._fsp--;


            	    										doneComposite();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            				

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleUnorderedGroupVal"
    // PsiInternalSequencerTestLanguage.g:2240:1: entryRuleUnorderedGroupVal : ruleUnorderedGroupVal EOF ;
    public final void entryRuleUnorderedGroupVal() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2240:27: ( ruleUnorderedGroupVal EOF )
            // PsiInternalSequencerTestLanguage.g:2241:2: ruleUnorderedGroupVal EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupValElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroupVal();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroupVal"


    // $ANTLR start "ruleUnorderedGroupVal"
    // PsiInternalSequencerTestLanguage.g:2246:1: ruleUnorderedGroupVal : (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final void ruleUnorderedGroupVal() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2246:22: ( (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2247:2: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2247:2: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2248:3: otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedGroupVal_Kw1Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2255:3: ( (lv_val_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2256:4: (lv_val_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2256:4: (lv_val_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2257:5: lv_val_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUnorderedGroupVal_ValIDTerminalRuleCall_1_0ElementType());
            				
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_val_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroupVal"


    // $ANTLR start "entryRuleUnorderedGroupValDelegate"
    // PsiInternalSequencerTestLanguage.g:2270:1: entryRuleUnorderedGroupValDelegate : ruleUnorderedGroupValDelegate EOF ;
    public final void entryRuleUnorderedGroupValDelegate() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2270:35: ( ruleUnorderedGroupValDelegate EOF )
            // PsiInternalSequencerTestLanguage.g:2271:2: ruleUnorderedGroupValDelegate EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupValDelegateElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroupValDelegate();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroupValDelegate"


    // $ANTLR start "ruleUnorderedGroupValDelegate"
    // PsiInternalSequencerTestLanguage.g:2276:1: ruleUnorderedGroupValDelegate : ruleUnorderedGroupVal2 ;
    public final void ruleUnorderedGroupValDelegate() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2276:30: ( ruleUnorderedGroupVal2 )
            // PsiInternalSequencerTestLanguage.g:2277:2: ruleUnorderedGroupVal2
            {

            		markComposite(elementTypeProvider.getUnorderedGroupValDelegate_UnorderedGroupVal2ParserRuleCallElementType());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnorderedGroupVal2();

            state._fsp--;


            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroupValDelegate"


    // $ANTLR start "entryRuleUnorderedGroupVal2"
    // PsiInternalSequencerTestLanguage.g:2287:1: entryRuleUnorderedGroupVal2 : ruleUnorderedGroupVal2 EOF ;
    public final void entryRuleUnorderedGroupVal2() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2287:28: ( ruleUnorderedGroupVal2 EOF )
            // PsiInternalSequencerTestLanguage.g:2288:2: ruleUnorderedGroupVal2 EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupVal2ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroupVal2();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroupVal2"


    // $ANTLR start "ruleUnorderedGroupVal2"
    // PsiInternalSequencerTestLanguage.g:2293:1: ruleUnorderedGroupVal2 : (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final void ruleUnorderedGroupVal2() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2293:23: ( (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2294:2: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2294:2: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2295:3: otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedGroupVal2_Kw2Keyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2302:3: ( (lv_val_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2303:4: (lv_val_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2303:4: (lv_val_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2304:5: lv_val_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUnorderedGroupVal2_ValIDTerminalRuleCall_1_0ElementType());
            				
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_val_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroupVal2"


    // $ANTLR start "entryRuleUnorderedGroupOptional"
    // PsiInternalSequencerTestLanguage.g:2317:1: entryRuleUnorderedGroupOptional : ruleUnorderedGroupOptional EOF ;
    public final void entryRuleUnorderedGroupOptional() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2317:32: ( ruleUnorderedGroupOptional EOF )
            // PsiInternalSequencerTestLanguage.g:2318:2: ruleUnorderedGroupOptional EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupOptionalElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroupOptional();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroupOptional"


    // $ANTLR start "ruleUnorderedGroupOptional"
    // PsiInternalSequencerTestLanguage.g:2323:1: ruleUnorderedGroupOptional : (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) ) ;
    public final void ruleUnorderedGroupOptional() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;
        Token otherlv_5=null;
        Token lv_va2_6_0=null;
        Token otherlv_7=null;
        Token lv_val3_8_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2323:27: ( (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2324:2: (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2324:2: (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2325:3: otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedGroupOptional_NumberSignDigitTwoDigitFiveKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_26); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2332:3: ()
            // PsiInternalSequencerTestLanguage.g:2333:4: 
            {

            				precedeComposite(elementTypeProvider.getUnorderedGroupOptional_UnorderedGroupOptionalAction_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalSequencerTestLanguage.g:2338:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            // PsiInternalSequencerTestLanguage.g:2339:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // PsiInternalSequencerTestLanguage.g:2339:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:2340:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            				
            // PsiInternalSequencerTestLanguage.g:2343:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* )
            // PsiInternalSequencerTestLanguage.g:2344:6: ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )*
            {
            // PsiInternalSequencerTestLanguage.g:2344:6: ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )*
            loop36:
            do {
                int alt36=4;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2) ) {
                    alt36=3;
                }


                switch (alt36) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:2345:4: ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2345:4: ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2346:5: {...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2346:119: ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2347:6: ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2350:9: ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2350:10: {...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2350:19: (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2350:20: otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) )
            	    {

            	    									markLeaf(elementTypeProvider.getUnorderedGroupOptional_Kw1Keyword_2_0_0ElementType());
            	    								
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_3); 

            	    									doneLeaf(otherlv_3);
            	    								
            	    // PsiInternalSequencerTestLanguage.g:2357:9: ( (lv_val1_4_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2358:10: (lv_val1_4_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2358:10: (lv_val1_4_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2359:11: lv_val1_4_0= RULE_ID
            	    {

            	    											markLeaf(elementTypeProvider.getUnorderedGroupOptional_Val1IDTerminalRuleCall_2_0_1_0ElementType());
            	    										
            	    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            	    											doneLeaf(lv_val1_4_0);
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:2374:4: ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2374:4: ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2375:5: {...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2375:119: ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2376:6: ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2379:9: ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2379:10: {...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2379:19: (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2379:20: otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) )
            	    {

            	    									markLeaf(elementTypeProvider.getUnorderedGroupOptional_Kw2Keyword_2_1_0ElementType());
            	    								
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	    									doneLeaf(otherlv_5);
            	    								
            	    // PsiInternalSequencerTestLanguage.g:2386:9: ( (lv_va2_6_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2387:10: (lv_va2_6_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2387:10: (lv_va2_6_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2388:11: lv_va2_6_0= RULE_ID
            	    {

            	    											markLeaf(elementTypeProvider.getUnorderedGroupOptional_Va2IDTerminalRuleCall_2_1_1_0ElementType());
            	    										
            	    lv_va2_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            	    											doneLeaf(lv_va2_6_0);
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalSequencerTestLanguage.g:2403:4: ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2403:4: ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2404:5: {...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2404:119: ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2405:6: ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2408:9: ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2408:10: {...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2408:19: (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2408:20: otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) )
            	    {

            	    									markLeaf(elementTypeProvider.getUnorderedGroupOptional_Kw3Keyword_2_2_0ElementType());
            	    								
            	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	    									doneLeaf(otherlv_7);
            	    								
            	    // PsiInternalSequencerTestLanguage.g:2415:9: ( (lv_val3_8_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2416:10: (lv_val3_8_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2416:10: (lv_val3_8_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2417:11: lv_val3_8_0= RULE_ID
            	    {

            	    											markLeaf(elementTypeProvider.getUnorderedGroupOptional_Val3IDTerminalRuleCall_2_2_1_0ElementType());
            	    										
            	    lv_val3_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            	    											doneLeaf(lv_val3_8_0);
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            				

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroupOptional"


    // $ANTLR start "entryRuleUnorderedGroupBoolean"
    // PsiInternalSequencerTestLanguage.g:2443:1: entryRuleUnorderedGroupBoolean : ruleUnorderedGroupBoolean EOF ;
    public final void entryRuleUnorderedGroupBoolean() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2443:31: ( ruleUnorderedGroupBoolean EOF )
            // PsiInternalSequencerTestLanguage.g:2444:2: ruleUnorderedGroupBoolean EOF
            {
             markComposite(elementTypeProvider.getUnorderedGroupBooleanElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnorderedGroupBoolean();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedGroupBoolean"


    // $ANTLR start "ruleUnorderedGroupBoolean"
    // PsiInternalSequencerTestLanguage.g:2449:1: ruleUnorderedGroupBoolean : (otherlv_0= '#26' () ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) ) ) ) ;
    public final void ruleUnorderedGroupBoolean() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_3_0=null;
        Token lv_val2_4_0=null;
        Token lv_val3_5_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2449:26: ( (otherlv_0= '#26' () ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2450:2: (otherlv_0= '#26' () ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2450:2: (otherlv_0= '#26' () ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2451:3: otherlv_0= '#26' () ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) ) )
            {

            			markLeaf(elementTypeProvider.getUnorderedGroupBoolean_NumberSignDigitTwoDigitSixKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_26); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2458:3: ()
            // PsiInternalSequencerTestLanguage.g:2459:4: 
            {

            				precedeComposite(elementTypeProvider.getUnorderedGroupBoolean_UnorderedGroupBooleanAction_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalSequencerTestLanguage.g:2464:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) ) )
            // PsiInternalSequencerTestLanguage.g:2465:4: ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) )
            {
            // PsiInternalSequencerTestLanguage.g:2465:4: ( ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:2466:5: ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
            				
            // PsiInternalSequencerTestLanguage.g:2469:5: ( ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )* )
            // PsiInternalSequencerTestLanguage.g:2470:6: ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )*
            {
            // PsiInternalSequencerTestLanguage.g:2470:6: ( ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) ) )*
            loop37:
            do {
                int alt37=4;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 2) ) {
                    alt37=3;
                }


                switch (alt37) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:2471:4: ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2471:4: ({...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2472:5: {...}? => ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupBoolean", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2472:118: ( ({...}? => ( (lv_val1_3_0= 'kw1' ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2473:6: ({...}? => ( (lv_val1_3_0= 'kw1' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2476:9: ({...}? => ( (lv_val1_3_0= 'kw1' ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2476:10: {...}? => ( (lv_val1_3_0= 'kw1' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupBoolean", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2476:19: ( (lv_val1_3_0= 'kw1' ) )
            	    // PsiInternalSequencerTestLanguage.g:2476:20: (lv_val1_3_0= 'kw1' )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2476:20: (lv_val1_3_0= 'kw1' )
            	    // PsiInternalSequencerTestLanguage.g:2477:10: lv_val1_3_0= 'kw1'
            	    {

            	    										markLeaf(elementTypeProvider.getUnorderedGroupBoolean_Val1Kw1Keyword_2_0_0ElementType());
            	    									
            	    lv_val1_3_0=(Token)match(input,16,FollowSets000.FOLLOW_26); 

            	    										doneLeaf(lv_val1_3_0);
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:2491:4: ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2491:4: ({...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2492:5: {...}? => ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupBoolean", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2492:118: ( ({...}? => ( (lv_val2_4_0= 'kw2' ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2493:6: ({...}? => ( (lv_val2_4_0= 'kw2' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2496:9: ({...}? => ( (lv_val2_4_0= 'kw2' ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2496:10: {...}? => ( (lv_val2_4_0= 'kw2' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupBoolean", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2496:19: ( (lv_val2_4_0= 'kw2' ) )
            	    // PsiInternalSequencerTestLanguage.g:2496:20: (lv_val2_4_0= 'kw2' )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2496:20: (lv_val2_4_0= 'kw2' )
            	    // PsiInternalSequencerTestLanguage.g:2497:10: lv_val2_4_0= 'kw2'
            	    {

            	    										markLeaf(elementTypeProvider.getUnorderedGroupBoolean_Val2Kw2Keyword_2_1_0ElementType());
            	    									
            	    lv_val2_4_0=(Token)match(input,17,FollowSets000.FOLLOW_26); 

            	    										doneLeaf(lv_val2_4_0);
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalSequencerTestLanguage.g:2511:4: ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2511:4: ({...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2512:5: {...}? => ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupBoolean", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2512:118: ( ({...}? => ( (lv_val3_5_0= 'kw3' ) ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2513:6: ({...}? => ( (lv_val3_5_0= 'kw3' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // PsiInternalSequencerTestLanguage.g:2516:9: ({...}? => ( (lv_val3_5_0= 'kw3' ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2516:10: {...}? => ( (lv_val3_5_0= 'kw3' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupBoolean", "true");
            	    }
            	    // PsiInternalSequencerTestLanguage.g:2516:19: ( (lv_val3_5_0= 'kw3' ) )
            	    // PsiInternalSequencerTestLanguage.g:2516:20: (lv_val3_5_0= 'kw3' )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2516:20: (lv_val3_5_0= 'kw3' )
            	    // PsiInternalSequencerTestLanguage.g:2517:10: lv_val3_5_0= 'kw3'
            	    {

            	    										markLeaf(elementTypeProvider.getUnorderedGroupBoolean_Val3Kw3Keyword_2_2_0ElementType());
            	    									
            	    lv_val3_5_0=(Token)match(input,19,FollowSets000.FOLLOW_26); 

            	    										doneLeaf(lv_val3_5_0);
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
            				

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleUnorderedGroupBoolean"


    // $ANTLR start "entryRuleComplex1"
    // PsiInternalSequencerTestLanguage.g:2542:1: entryRuleComplex1 : ruleComplex1 EOF ;
    public final void entryRuleComplex1() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2542:18: ( ruleComplex1 EOF )
            // PsiInternalSequencerTestLanguage.g:2543:2: ruleComplex1 EOF
            {
             markComposite(elementTypeProvider.getComplex1ElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComplex1();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplex1"


    // $ANTLR start "ruleComplex1"
    // PsiInternalSequencerTestLanguage.g:2548:1: ruleComplex1 : (otherlv_0= '#27' () (otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) ) )? (otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) ) )? ( (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) ) | (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) ) | (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) ) | (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) ) )* ) ;
    public final void ruleComplex1() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_val1_3_0=null;
        Token otherlv_4=null;
        Token lv_val2_5_0=null;
        Token otherlv_6=null;
        Token lv_val3_7_0=null;
        Token otherlv_8=null;
        Token lv_val4_9_0=null;
        Token otherlv_10=null;
        Token lv_val5_11_0=null;
        Token otherlv_12=null;
        Token lv_val6_13_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2548:13: ( (otherlv_0= '#27' () (otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) ) )? (otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) ) )? ( (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) ) | (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) ) | (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) ) | (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) ) )* ) )
            // PsiInternalSequencerTestLanguage.g:2549:2: (otherlv_0= '#27' () (otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) ) )? (otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) ) )? ( (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) ) | (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) ) | (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) ) | (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) ) )* )
            {
            // PsiInternalSequencerTestLanguage.g:2549:2: (otherlv_0= '#27' () (otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) ) )? (otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) ) )? ( (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) ) | (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) ) | (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) ) | (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) ) )* )
            // PsiInternalSequencerTestLanguage.g:2550:3: otherlv_0= '#27' () (otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) ) )? (otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) ) )? ( (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) ) | (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) ) | (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) ) | (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) ) )*
            {

            			markLeaf(elementTypeProvider.getComplex1_NumberSignDigitTwoDigitSevenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_27); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2557:3: ()
            // PsiInternalSequencerTestLanguage.g:2558:4: 
            {

            				precedeComposite(elementTypeProvider.getComplex1_Complex1Action_1ElementType());
            				doneComposite();
            			

            }

            // PsiInternalSequencerTestLanguage.g:2563:3: (otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:2564:4: otherlv_2= 'kw1' ( (lv_val1_3_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getComplex1_Kw1Keyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalSequencerTestLanguage.g:2571:4: ( (lv_val1_3_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:2572:5: (lv_val1_3_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:2572:5: (lv_val1_3_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:2573:6: lv_val1_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getComplex1_Val1IDTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_val1_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

                    						doneLeaf(lv_val1_3_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalSequencerTestLanguage.g:2583:3: (otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==17) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:2584:4: otherlv_4= 'kw2' ( (lv_val2_5_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getComplex1_Kw2Keyword_3_0ElementType());
                    			
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalSequencerTestLanguage.g:2591:4: ( (lv_val2_5_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:2592:5: (lv_val2_5_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:2592:5: (lv_val2_5_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:2593:6: lv_val2_5_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getComplex1_Val2IDTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_val2_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); 

                    						doneLeaf(lv_val2_5_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalSequencerTestLanguage.g:2603:3: ( (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) ) | (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) ) | (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) ) | (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) ) )*
            loop40:
            do {
                int alt40=5;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt40=1;
                    }
                    break;
                case 22:
                    {
                    alt40=2;
                    }
                    break;
                case 23:
                    {
                    alt40=3;
                    }
                    break;
                case 49:
                    {
                    alt40=4;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // PsiInternalSequencerTestLanguage.g:2604:4: (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2604:4: (otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2605:5: otherlv_6= 'kw3' ( (lv_val3_7_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getComplex1_Kw3Keyword_4_0_0ElementType());
            	    				
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	    					doneLeaf(otherlv_6);
            	    				
            	    // PsiInternalSequencerTestLanguage.g:2612:5: ( (lv_val3_7_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2613:6: (lv_val3_7_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2613:6: (lv_val3_7_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2614:7: lv_val3_7_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getComplex1_Val3IDTerminalRuleCall_4_0_1_0ElementType());
            	    						
            	    lv_val3_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); 

            	    							doneLeaf(lv_val3_7_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalSequencerTestLanguage.g:2625:4: (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2625:4: (otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2626:5: otherlv_8= 'kw4' ( (lv_val4_9_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getComplex1_Kw4Keyword_4_1_0ElementType());
            	    				
            	    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            	    					doneLeaf(otherlv_8);
            	    				
            	    // PsiInternalSequencerTestLanguage.g:2633:5: ( (lv_val4_9_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2634:6: (lv_val4_9_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2634:6: (lv_val4_9_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2635:7: lv_val4_9_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getComplex1_Val4IDTerminalRuleCall_4_1_1_0ElementType());
            	    						
            	    lv_val4_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); 

            	    							doneLeaf(lv_val4_9_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalSequencerTestLanguage.g:2646:4: (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2646:4: (otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2647:5: otherlv_10= 'kw5' ( (lv_val5_11_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getComplex1_Kw5Keyword_4_2_0ElementType());
            	    				
            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            	    					doneLeaf(otherlv_10);
            	    				
            	    // PsiInternalSequencerTestLanguage.g:2654:5: ( (lv_val5_11_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2655:6: (lv_val5_11_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2655:6: (lv_val5_11_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2656:7: lv_val5_11_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getComplex1_Val5IDTerminalRuleCall_4_2_1_0ElementType());
            	    						
            	    lv_val5_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); 

            	    							doneLeaf(lv_val5_11_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalSequencerTestLanguage.g:2667:4: (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2667:4: (otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) ) )
            	    // PsiInternalSequencerTestLanguage.g:2668:5: otherlv_12= 'kw6' ( (lv_val6_13_0= RULE_ID ) )
            	    {

            	    					markLeaf(elementTypeProvider.getComplex1_Kw6Keyword_4_3_0ElementType());
            	    				
            	    otherlv_12=(Token)match(input,49,FollowSets000.FOLLOW_3); 

            	    					doneLeaf(otherlv_12);
            	    				
            	    // PsiInternalSequencerTestLanguage.g:2675:5: ( (lv_val6_13_0= RULE_ID ) )
            	    // PsiInternalSequencerTestLanguage.g:2676:6: (lv_val6_13_0= RULE_ID )
            	    {
            	    // PsiInternalSequencerTestLanguage.g:2676:6: (lv_val6_13_0= RULE_ID )
            	    // PsiInternalSequencerTestLanguage.g:2677:7: lv_val6_13_0= RULE_ID
            	    {

            	    							markLeaf(elementTypeProvider.getComplex1_Val6IDTerminalRuleCall_4_3_1_0ElementType());
            	    						
            	    lv_val6_13_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); 

            	    							doneLeaf(lv_val6_13_0);
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleComplex1"


    // $ANTLR start "entryRuleOptionalDouble"
    // PsiInternalSequencerTestLanguage.g:2692:1: entryRuleOptionalDouble : ruleOptionalDouble EOF ;
    public final void entryRuleOptionalDouble() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2692:24: ( ruleOptionalDouble EOF )
            // PsiInternalSequencerTestLanguage.g:2693:2: ruleOptionalDouble EOF
            {
             markComposite(elementTypeProvider.getOptionalDoubleElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOptionalDouble();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalDouble"


    // $ANTLR start "ruleOptionalDouble"
    // PsiInternalSequencerTestLanguage.g:2698:1: ruleOptionalDouble : (otherlv_0= '#28' ( (lv_double0_1_0= ruleDOUBLE ) ) ( ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) ) )? ) ;
    public final void ruleOptionalDouble() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2698:19: ( (otherlv_0= '#28' ( (lv_double0_1_0= ruleDOUBLE ) ) ( ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) ) )? ) )
            // PsiInternalSequencerTestLanguage.g:2699:2: (otherlv_0= '#28' ( (lv_double0_1_0= ruleDOUBLE ) ) ( ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) ) )? )
            {
            // PsiInternalSequencerTestLanguage.g:2699:2: (otherlv_0= '#28' ( (lv_double0_1_0= ruleDOUBLE ) ) ( ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) ) )? )
            // PsiInternalSequencerTestLanguage.g:2700:3: otherlv_0= '#28' ( (lv_double0_1_0= ruleDOUBLE ) ) ( ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) ) )?
            {

            			markLeaf(elementTypeProvider.getOptionalDouble_NumberSignDigitTwoDigitEightKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_21); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2707:3: ( (lv_double0_1_0= ruleDOUBLE ) )
            // PsiInternalSequencerTestLanguage.g:2708:4: (lv_double0_1_0= ruleDOUBLE )
            {
            // PsiInternalSequencerTestLanguage.g:2708:4: (lv_double0_1_0= ruleDOUBLE )
            // PsiInternalSequencerTestLanguage.g:2709:5: lv_double0_1_0= ruleDOUBLE
            {

            					markComposite(elementTypeProvider.getOptionalDouble_Double0DOUBLEParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_22);
            ruleDOUBLE();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:2718:3: ( ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:2719:4: ( (lv_double1_2_0= ruleDOUBLE ) ) ( (lv_double2_3_0= ruleDOUBLE ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:2719:4: ( (lv_double1_2_0= ruleDOUBLE ) )
                    // PsiInternalSequencerTestLanguage.g:2720:5: (lv_double1_2_0= ruleDOUBLE )
                    {
                    // PsiInternalSequencerTestLanguage.g:2720:5: (lv_double1_2_0= ruleDOUBLE )
                    // PsiInternalSequencerTestLanguage.g:2721:6: lv_double1_2_0= ruleDOUBLE
                    {

                    						markComposite(elementTypeProvider.getOptionalDouble_Double1DOUBLEParserRuleCall_2_0_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_21);
                    ruleDOUBLE();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }

                    // PsiInternalSequencerTestLanguage.g:2730:4: ( (lv_double2_3_0= ruleDOUBLE ) )
                    // PsiInternalSequencerTestLanguage.g:2731:5: (lv_double2_3_0= ruleDOUBLE )
                    {
                    // PsiInternalSequencerTestLanguage.g:2731:5: (lv_double2_3_0= ruleDOUBLE )
                    // PsiInternalSequencerTestLanguage.g:2732:6: lv_double2_3_0= ruleDOUBLE
                    {

                    						markComposite(elementTypeProvider.getOptionalDouble_Double2DOUBLEParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDOUBLE();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleOptionalDouble"


    // $ANTLR start "entryRuleDOUBLE"
    // PsiInternalSequencerTestLanguage.g:2746:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2746:16: ( ruleDOUBLE EOF )
            // PsiInternalSequencerTestLanguage.g:2747:2: ruleDOUBLE EOF
            {
             markComposite(elementTypeProvider.getDOUBLEElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // PsiInternalSequencerTestLanguage.g:2752:1: ruleDOUBLE : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final void ruleDOUBLE() throws RecognitionException {
        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2752:11: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // PsiInternalSequencerTestLanguage.g:2753:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // PsiInternalSequencerTestLanguage.g:2753:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // PsiInternalSequencerTestLanguage.g:2754:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {

            			markLeaf(elementTypeProvider.getDOUBLE_INTTerminalRuleCall_0ElementType());
            		
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_30); 

            			doneLeaf(this_INT_0);
            		
            // PsiInternalSequencerTestLanguage.g:2761:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:2762:4: kw= '.' this_INT_2= RULE_INT
                    {

                    				markLeaf(elementTypeProvider.getDOUBLE_FullStopKeyword_1_0ElementType());
                    			
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_21); 

                    				doneLeaf(kw);
                    			

                    				markLeaf(elementTypeProvider.getDOUBLE_INTTerminalRuleCall_1_1ElementType());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    				doneLeaf(this_INT_2);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleNullValueGenerated"
    // PsiInternalSequencerTestLanguage.g:2781:1: entryRuleNullValueGenerated : ruleNullValueGenerated EOF ;
    public final void entryRuleNullValueGenerated() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2781:28: ( ruleNullValueGenerated EOF )
            // PsiInternalSequencerTestLanguage.g:2782:2: ruleNullValueGenerated EOF
            {
             markComposite(elementTypeProvider.getNullValueGeneratedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNullValueGenerated();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValueGenerated"


    // $ANTLR start "ruleNullValueGenerated"
    // PsiInternalSequencerTestLanguage.g:2787:1: ruleNullValueGenerated : (otherlv_0= '#29' ( (lv_value_1_0= ruleNULL_STRING ) ) ) ;
    public final void ruleNullValueGenerated() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2787:23: ( (otherlv_0= '#29' ( (lv_value_1_0= ruleNULL_STRING ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2788:2: (otherlv_0= '#29' ( (lv_value_1_0= ruleNULL_STRING ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2788:2: (otherlv_0= '#29' ( (lv_value_1_0= ruleNULL_STRING ) ) )
            // PsiInternalSequencerTestLanguage.g:2789:3: otherlv_0= '#29' ( (lv_value_1_0= ruleNULL_STRING ) )
            {

            			markLeaf(elementTypeProvider.getNullValueGenerated_NumberSignDigitTwoDigitNineKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_31); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2796:3: ( (lv_value_1_0= ruleNULL_STRING ) )
            // PsiInternalSequencerTestLanguage.g:2797:4: (lv_value_1_0= ruleNULL_STRING )
            {
            // PsiInternalSequencerTestLanguage.g:2797:4: (lv_value_1_0= ruleNULL_STRING )
            // PsiInternalSequencerTestLanguage.g:2798:5: lv_value_1_0= ruleNULL_STRING
            {

            					markComposite(elementTypeProvider.getNullValueGenerated_ValueNULL_STRINGParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNULL_STRING();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNullValueGenerated"


    // $ANTLR start "entryRuleNullValueInterpreted"
    // PsiInternalSequencerTestLanguage.g:2811:1: entryRuleNullValueInterpreted : ruleNullValueInterpreted EOF ;
    public final void entryRuleNullValueInterpreted() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2811:30: ( ruleNullValueInterpreted EOF )
            // PsiInternalSequencerTestLanguage.g:2812:2: ruleNullValueInterpreted EOF
            {
             markComposite(elementTypeProvider.getNullValueInterpretedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNullValueInterpreted();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValueInterpreted"


    // $ANTLR start "ruleNullValueInterpreted"
    // PsiInternalSequencerTestLanguage.g:2817:1: ruleNullValueInterpreted : (otherlv_0= '#30' ( (lv_value_1_0= ruleNULL_STRING ) ) ( (lv_foo_2_0= RULE_ID ) )? ) ;
    public final void ruleNullValueInterpreted() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_foo_2_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2817:25: ( (otherlv_0= '#30' ( (lv_value_1_0= ruleNULL_STRING ) ) ( (lv_foo_2_0= RULE_ID ) )? ) )
            // PsiInternalSequencerTestLanguage.g:2818:2: (otherlv_0= '#30' ( (lv_value_1_0= ruleNULL_STRING ) ) ( (lv_foo_2_0= RULE_ID ) )? )
            {
            // PsiInternalSequencerTestLanguage.g:2818:2: (otherlv_0= '#30' ( (lv_value_1_0= ruleNULL_STRING ) ) ( (lv_foo_2_0= RULE_ID ) )? )
            // PsiInternalSequencerTestLanguage.g:2819:3: otherlv_0= '#30' ( (lv_value_1_0= ruleNULL_STRING ) ) ( (lv_foo_2_0= RULE_ID ) )?
            {

            			markLeaf(elementTypeProvider.getNullValueInterpreted_NumberSignDigitThreeDigitZeroKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_31); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2826:3: ( (lv_value_1_0= ruleNULL_STRING ) )
            // PsiInternalSequencerTestLanguage.g:2827:4: (lv_value_1_0= ruleNULL_STRING )
            {
            // PsiInternalSequencerTestLanguage.g:2827:4: (lv_value_1_0= ruleNULL_STRING )
            // PsiInternalSequencerTestLanguage.g:2828:5: lv_value_1_0= ruleNULL_STRING
            {

            					markComposite(elementTypeProvider.getNullValueInterpreted_ValueNULL_STRINGParserRuleCall_1_0ElementType());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            ruleNULL_STRING();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:2837:3: ( (lv_foo_2_0= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:2838:4: (lv_foo_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:2838:4: (lv_foo_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:2839:5: lv_foo_2_0= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getNullValueInterpreted_FooIDTerminalRuleCall_2_0ElementType());
                    				
                    lv_foo_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					doneLeaf(lv_foo_2_0);
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNullValueInterpreted"


    // $ANTLR start "entryRuleNULL_STRING"
    // PsiInternalSequencerTestLanguage.g:2852:1: entryRuleNULL_STRING : ruleNULL_STRING EOF ;
    public final void entryRuleNULL_STRING() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2852:21: ( ruleNULL_STRING EOF )
            // PsiInternalSequencerTestLanguage.g:2853:2: ruleNULL_STRING EOF
            {
             markComposite(elementTypeProvider.getNULL_STRINGElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNULL_STRING();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNULL_STRING"


    // $ANTLR start "ruleNULL_STRING"
    // PsiInternalSequencerTestLanguage.g:2858:1: ruleNULL_STRING : this_STRING_0= RULE_STRING ;
    public final void ruleNULL_STRING() throws RecognitionException {
        Token this_STRING_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2858:16: (this_STRING_0= RULE_STRING )
            // PsiInternalSequencerTestLanguage.g:2859:2: this_STRING_0= RULE_STRING
            {

            		markLeaf(elementTypeProvider.getNULL_STRING_STRINGTerminalRuleCallElementType());
            	
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            		doneLeaf(this_STRING_0);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNULL_STRING"


    // $ANTLR start "entryRuleNullCrossRefGenerated"
    // PsiInternalSequencerTestLanguage.g:2869:1: entryRuleNullCrossRefGenerated : ruleNullCrossRefGenerated EOF ;
    public final void entryRuleNullCrossRefGenerated() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2869:31: ( ruleNullCrossRefGenerated EOF )
            // PsiInternalSequencerTestLanguage.g:2870:2: ruleNullCrossRefGenerated EOF
            {
             markComposite(elementTypeProvider.getNullCrossRefGeneratedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNullCrossRefGenerated();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullCrossRefGenerated"


    // $ANTLR start "ruleNullCrossRefGenerated"
    // PsiInternalSequencerTestLanguage.g:2875:1: ruleNullCrossRefGenerated : (otherlv_0= '#31' ( (otherlv_1= RULE_ID ) ) ) ;
    public final void ruleNullCrossRefGenerated() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2875:26: ( (otherlv_0= '#31' ( (otherlv_1= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2876:2: (otherlv_0= '#31' ( (otherlv_1= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2876:2: (otherlv_0= '#31' ( (otherlv_1= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2877:3: otherlv_0= '#31' ( (otherlv_1= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getNullCrossRefGenerated_NumberSignDigitThreeDigitOneKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2884:3: ( (otherlv_1= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2885:4: (otherlv_1= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2885:4: (otherlv_1= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2886:5: otherlv_1= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNullCrossRefGenerated_RefEObjectCrossReference_1_0ElementType());
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(otherlv_1);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNullCrossRefGenerated"


    // $ANTLR start "entryRuleNullCrossRefInterpreted"
    // PsiInternalSequencerTestLanguage.g:2899:1: entryRuleNullCrossRefInterpreted : ruleNullCrossRefInterpreted EOF ;
    public final void entryRuleNullCrossRefInterpreted() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2899:33: ( ruleNullCrossRefInterpreted EOF )
            // PsiInternalSequencerTestLanguage.g:2900:2: ruleNullCrossRefInterpreted EOF
            {
             markComposite(elementTypeProvider.getNullCrossRefInterpretedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNullCrossRefInterpreted();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullCrossRefInterpreted"


    // $ANTLR start "ruleNullCrossRefInterpreted"
    // PsiInternalSequencerTestLanguage.g:2905:1: ruleNullCrossRefInterpreted : (otherlv_0= '#32' ( (otherlv_1= RULE_ID ) ) ( (lv_foo_2_0= RULE_ID ) )? ) ;
    public final void ruleNullCrossRefInterpreted() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_foo_2_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2905:28: ( (otherlv_0= '#32' ( (otherlv_1= RULE_ID ) ) ( (lv_foo_2_0= RULE_ID ) )? ) )
            // PsiInternalSequencerTestLanguage.g:2906:2: (otherlv_0= '#32' ( (otherlv_1= RULE_ID ) ) ( (lv_foo_2_0= RULE_ID ) )? )
            {
            // PsiInternalSequencerTestLanguage.g:2906:2: (otherlv_0= '#32' ( (otherlv_1= RULE_ID ) ) ( (lv_foo_2_0= RULE_ID ) )? )
            // PsiInternalSequencerTestLanguage.g:2907:3: otherlv_0= '#32' ( (otherlv_1= RULE_ID ) ) ( (lv_foo_2_0= RULE_ID ) )?
            {

            			markLeaf(elementTypeProvider.getNullCrossRefInterpreted_NumberSignDigitThreeDigitTwoKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2914:3: ( (otherlv_1= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2915:4: (otherlv_1= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2915:4: (otherlv_1= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2916:5: otherlv_1= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNullCrossRefInterpreted_RefEObjectCrossReference_1_0ElementType());
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            					doneLeaf(otherlv_1);
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:2925:3: ( (lv_foo_2_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:2926:4: (lv_foo_2_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:2926:4: (lv_foo_2_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:2927:5: lv_foo_2_0= RULE_ID
                    {

                    					markLeaf(elementTypeProvider.getNullCrossRefInterpreted_FooIDTerminalRuleCall_2_0ElementType());
                    				
                    lv_foo_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					doneLeaf(lv_foo_2_0);
                    				

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleNullCrossRefInterpreted"


    // $ANTLR start "entryRuleFragmentCaller"
    // PsiInternalSequencerTestLanguage.g:2940:1: entryRuleFragmentCaller : ruleFragmentCaller EOF ;
    public final void entryRuleFragmentCaller() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:2940:24: ( ruleFragmentCaller EOF )
            // PsiInternalSequencerTestLanguage.g:2941:2: ruleFragmentCaller EOF
            {
             markComposite(elementTypeProvider.getFragmentCallerElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFragmentCaller();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFragmentCaller"


    // $ANTLR start "ruleFragmentCaller"
    // PsiInternalSequencerTestLanguage.g:2946:1: ruleFragmentCaller : (otherlv_0= '#33' ( (lv_val1_1_0= RULE_ID ) ) ruleFragment1 ( (lv_val_3_0= RULE_ID ) ) ) ;
    public final void ruleFragmentCaller() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2946:19: ( (otherlv_0= '#33' ( (lv_val1_1_0= RULE_ID ) ) ruleFragment1 ( (lv_val_3_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:2947:2: (otherlv_0= '#33' ( (lv_val1_1_0= RULE_ID ) ) ruleFragment1 ( (lv_val_3_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:2947:2: (otherlv_0= '#33' ( (lv_val1_1_0= RULE_ID ) ) ruleFragment1 ( (lv_val_3_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2948:3: otherlv_0= '#33' ( (lv_val1_1_0= RULE_ID ) ) ruleFragment1 ( (lv_val_3_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getFragmentCaller_NumberSignDigitThreeDigitThreeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:2955:3: ( (lv_val1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2956:4: (lv_val1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2956:4: (lv_val1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2957:5: lv_val1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentCaller_Val1IDTerminalRuleCall_1_0ElementType());
            				
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            					doneLeaf(lv_val1_1_0);
            				

            }


            }


            			markComposite(elementTypeProvider.getFragmentCaller_Fragment1ParserRuleCall_2ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_3);
            ruleFragment1();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalSequencerTestLanguage.g:2973:3: ( (lv_val_3_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2974:4: (lv_val_3_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2974:4: (lv_val_3_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2975:5: lv_val_3_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFragmentCaller_ValIDTerminalRuleCall_3_0ElementType());
            				
            lv_val_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_val_3_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleFragmentCaller"


    // $ANTLR start "ruleFragment1"
    // PsiInternalSequencerTestLanguage.g:2989:1: ruleFragment1 : ( (lv_fragVal_0_0= RULE_ID ) ) ;
    public final void ruleFragment1() throws RecognitionException {
        Token lv_fragVal_0_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:2989:14: ( ( (lv_fragVal_0_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:2990:2: ( (lv_fragVal_0_0= RULE_ID ) )
            {
            // PsiInternalSequencerTestLanguage.g:2990:2: ( (lv_fragVal_0_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:2991:3: (lv_fragVal_0_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:2991:3: (lv_fragVal_0_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:2992:4: lv_fragVal_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getFragment1_FragValIDTerminalRuleCall_0ElementType());
            			
            lv_fragVal_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				doneLeaf(lv_fragVal_0_0);
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleFragment1"


    // $ANTLR start "entryRuleParameterCaller"
    // PsiInternalSequencerTestLanguage.g:3004:1: entryRuleParameterCaller : ruleParameterCaller EOF ;
    public final void entryRuleParameterCaller() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:3004:25: ( ruleParameterCaller EOF )
            // PsiInternalSequencerTestLanguage.g:3005:2: ruleParameterCaller EOF
            {
             markComposite(elementTypeProvider.getParameterCallerElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameterCaller();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterCaller"


    // $ANTLR start "ruleParameterCaller"
    // PsiInternalSequencerTestLanguage.g:3010:1: ruleParameterCaller : (otherlv_0= '#34' ( (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) ) | (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) ) | (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) ) | (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) ) ) ) ;
    public final void ruleParameterCaller() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3010:20: ( (otherlv_0= '#34' ( (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) ) | (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) ) | (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) ) | (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:3011:2: (otherlv_0= '#34' ( (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) ) | (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) ) | (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) ) | (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:3011:2: (otherlv_0= '#34' ( (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) ) | (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) ) | (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) ) | (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) ) ) )
            // PsiInternalSequencerTestLanguage.g:3012:3: otherlv_0= '#34' ( (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) ) | (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) ) | (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) ) | (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) ) )
            {

            			markLeaf(elementTypeProvider.getParameterCaller_NumberSignDigitThreeDigitFourKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_32); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:3019:3: ( (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) ) | (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) ) | (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) ) | (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt45=1;
                }
                break;
            case 17:
                {
                alt45=2;
                }
                break;
            case 19:
                {
                alt45=3;
                }
                break;
            case 22:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:3020:4: (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:3020:4: (otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) ) )
                    // PsiInternalSequencerTestLanguage.g:3021:5: otherlv_1= 'kw1' ( (lv_p_2_0= norm3_Parameterized ) )
                    {

                    					markLeaf(elementTypeProvider.getParameterCaller_Kw1Keyword_1_0_0ElementType());
                    				
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_33); 

                    					doneLeaf(otherlv_1);
                    				
                    // PsiInternalSequencerTestLanguage.g:3028:5: ( (lv_p_2_0= norm3_Parameterized ) )
                    // PsiInternalSequencerTestLanguage.g:3029:6: (lv_p_2_0= norm3_Parameterized )
                    {
                    // PsiInternalSequencerTestLanguage.g:3029:6: (lv_p_2_0= norm3_Parameterized )
                    // PsiInternalSequencerTestLanguage.g:3030:7: lv_p_2_0= norm3_Parameterized
                    {

                    							markComposite(elementTypeProvider.getParameterCaller_PParameterizedParserRuleCall_1_0_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    norm3_Parameterized();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalSequencerTestLanguage.g:3041:4: (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:3041:4: (otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) ) )
                    // PsiInternalSequencerTestLanguage.g:3042:5: otherlv_3= 'kw2' ( (lv_p_4_0= norm1_Parameterized ) )
                    {

                    					markLeaf(elementTypeProvider.getParameterCaller_Kw2Keyword_1_1_0ElementType());
                    				
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_33); 

                    					doneLeaf(otherlv_3);
                    				
                    // PsiInternalSequencerTestLanguage.g:3049:5: ( (lv_p_4_0= norm1_Parameterized ) )
                    // PsiInternalSequencerTestLanguage.g:3050:6: (lv_p_4_0= norm1_Parameterized )
                    {
                    // PsiInternalSequencerTestLanguage.g:3050:6: (lv_p_4_0= norm1_Parameterized )
                    // PsiInternalSequencerTestLanguage.g:3051:7: lv_p_4_0= norm1_Parameterized
                    {

                    							markComposite(elementTypeProvider.getParameterCaller_PParameterizedParserRuleCall_1_1_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    norm1_Parameterized();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalSequencerTestLanguage.g:3062:4: (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:3062:4: (otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) ) )
                    // PsiInternalSequencerTestLanguage.g:3063:5: otherlv_5= 'kw3' ( (lv_p_6_0= norm2_Parameterized ) )
                    {

                    					markLeaf(elementTypeProvider.getParameterCaller_Kw3Keyword_1_2_0ElementType());
                    				
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_34); 

                    					doneLeaf(otherlv_5);
                    				
                    // PsiInternalSequencerTestLanguage.g:3070:5: ( (lv_p_6_0= norm2_Parameterized ) )
                    // PsiInternalSequencerTestLanguage.g:3071:6: (lv_p_6_0= norm2_Parameterized )
                    {
                    // PsiInternalSequencerTestLanguage.g:3071:6: (lv_p_6_0= norm2_Parameterized )
                    // PsiInternalSequencerTestLanguage.g:3072:7: lv_p_6_0= norm2_Parameterized
                    {

                    							markComposite(elementTypeProvider.getParameterCaller_PParameterizedParserRuleCall_1_2_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    norm2_Parameterized();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalSequencerTestLanguage.g:3083:4: (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) )
                    {
                    // PsiInternalSequencerTestLanguage.g:3083:4: (otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) ) )
                    // PsiInternalSequencerTestLanguage.g:3084:5: otherlv_7= 'kw4' ( (lv_p_8_0= ruleParameterized ) )
                    {

                    					markLeaf(elementTypeProvider.getParameterCaller_Kw4Keyword_1_3_0ElementType());
                    				
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_34); 

                    					doneLeaf(otherlv_7);
                    				
                    // PsiInternalSequencerTestLanguage.g:3091:5: ( (lv_p_8_0= ruleParameterized ) )
                    // PsiInternalSequencerTestLanguage.g:3092:6: (lv_p_8_0= ruleParameterized )
                    {
                    // PsiInternalSequencerTestLanguage.g:3092:6: (lv_p_8_0= ruleParameterized )
                    // PsiInternalSequencerTestLanguage.g:3093:7: lv_p_8_0= ruleParameterized
                    {

                    							markComposite(elementTypeProvider.getParameterCaller_PParameterizedParserRuleCall_1_3_1_0ElementType());
                    						
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParameterized();

                    state._fsp--;


                    							doneComposite();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParameterCaller"


    // $ANTLR start "entryRuleParameterized"
    // PsiInternalSequencerTestLanguage.g:3108:1: entryRuleParameterized : ruleParameterized EOF ;
    public final void entryRuleParameterized() throws RecognitionException {
        try {
            // PsiInternalSequencerTestLanguage.g:3108:23: ( ruleParameterized EOF )
            // PsiInternalSequencerTestLanguage.g:3109:2: ruleParameterized EOF
            {
             markComposite(elementTypeProvider.getParameterizedElementType()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameterized();

            state._fsp--;

            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterized"


    // $ANTLR start "ruleParameterized"
    // PsiInternalSequencerTestLanguage.g:3114:1: ruleParameterized : (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) ) ;
    public final void ruleParameterized() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_v2_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3114:18: ( (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:3115:2: (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:3115:2: (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:3116:3: otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getParameterized_Kwp2Keyword_1_0ElementType());
            		
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:3123:3: ( (lv_v2_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:3124:4: (lv_v2_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:3124:4: (lv_v2_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:3125:5: lv_v2_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getParameterized_V2IDTerminalRuleCall_1_1_0ElementType());
            				
            lv_v2_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_v2_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParameterized"


    // $ANTLR start "norm1_Parameterized"
    // PsiInternalSequencerTestLanguage.g:3139:1: norm1_Parameterized : (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) ) ;
    public final void norm1_Parameterized() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_v1_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3139:20: ( (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:3140:2: (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:3140:2: (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:3141:3: otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getParameterized_Kwp1Keyword_0_0ElementType());
            		
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:3148:3: ( (lv_v1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:3149:4: (lv_v1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:3149:4: (lv_v1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:3150:5: lv_v1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getParameterized_V1IDTerminalRuleCall_0_1_0ElementType());
            				
            lv_v1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_v1_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "norm1_Parameterized"


    // $ANTLR start "norm2_Parameterized"
    // PsiInternalSequencerTestLanguage.g:3164:1: norm2_Parameterized : (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) (otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) ) )? ) ;
    public final void norm2_Parameterized() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_v2_1_0=null;
        Token otherlv_2=null;
        Token lv_v3_3_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3164:20: ( (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) (otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) ) )? ) )
            // PsiInternalSequencerTestLanguage.g:3165:2: (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) (otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) ) )? )
            {
            // PsiInternalSequencerTestLanguage.g:3165:2: (otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) (otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) ) )? )
            // PsiInternalSequencerTestLanguage.g:3166:3: otherlv_0= 'kwp2' ( (lv_v2_1_0= RULE_ID ) ) (otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) ) )?
            {

            			markLeaf(elementTypeProvider.getParameterized_Kwp2Keyword_1_0ElementType());
            		
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:3173:3: ( (lv_v2_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:3174:4: (lv_v2_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:3174:4: (lv_v2_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:3175:5: lv_v2_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getParameterized_V2IDTerminalRuleCall_1_1_0ElementType());
            				
            lv_v2_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); 

            					doneLeaf(lv_v2_1_0);
            				

            }


            }

            // PsiInternalSequencerTestLanguage.g:3184:3: (otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==60) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalSequencerTestLanguage.g:3185:4: otherlv_2= 'kwp3' ( (lv_v3_3_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getParameterized_Kwp3Keyword_1_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalSequencerTestLanguage.g:3192:4: ( (lv_v3_3_0= RULE_ID ) )
                    // PsiInternalSequencerTestLanguage.g:3193:5: (lv_v3_3_0= RULE_ID )
                    {
                    // PsiInternalSequencerTestLanguage.g:3193:5: (lv_v3_3_0= RULE_ID )
                    // PsiInternalSequencerTestLanguage.g:3194:6: lv_v3_3_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getParameterized_V3IDTerminalRuleCall_1_2_1_0ElementType());
                    					
                    lv_v3_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						doneLeaf(lv_v3_3_0);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "norm2_Parameterized"


    // $ANTLR start "norm3_Parameterized"
    // PsiInternalSequencerTestLanguage.g:3209:1: norm3_Parameterized : (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) ) ;
    public final void norm3_Parameterized() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_v1_1_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3209:20: ( (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) ) )
            // PsiInternalSequencerTestLanguage.g:3210:2: (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) )
            {
            // PsiInternalSequencerTestLanguage.g:3210:2: (otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) ) )
            // PsiInternalSequencerTestLanguage.g:3211:3: otherlv_0= 'kwp1' ( (lv_v1_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getParameterized_Kwp1Keyword_0_0ElementType());
            		
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalSequencerTestLanguage.g:3218:3: ( (lv_v1_1_0= RULE_ID ) )
            // PsiInternalSequencerTestLanguage.g:3219:4: (lv_v1_1_0= RULE_ID )
            {
            // PsiInternalSequencerTestLanguage.g:3219:4: (lv_v1_1_0= RULE_ID )
            // PsiInternalSequencerTestLanguage.g:3220:5: lv_v1_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getParameterized_V1IDTerminalRuleCall_0_1_0ElementType());
            				
            lv_v1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					doneLeaf(lv_v1_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "norm3_Parameterized"


    // $ANTLR start "ruleDefEnum1"
    // PsiInternalSequencerTestLanguage.g:3233:1: ruleDefEnum1 : (enumLiteral_0= 'kw1' ) ;
    public final void ruleDefEnum1() throws RecognitionException {
        Token enumLiteral_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3233:13: ( (enumLiteral_0= 'kw1' ) )
            // PsiInternalSequencerTestLanguage.g:3234:2: (enumLiteral_0= 'kw1' )
            {
            // PsiInternalSequencerTestLanguage.g:3234:2: (enumLiteral_0= 'kw1' )
            // PsiInternalSequencerTestLanguage.g:3235:3: enumLiteral_0= 'kw1'
            {

            			markLeaf(elementTypeProvider.getDefEnum1_Kw1EnumLiteralDeclarationElementType());
            		
            enumLiteral_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			doneLeaf(enumLiteral_0);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDefEnum1"


    // $ANTLR start "ruleDefEnum2"
    // PsiInternalSequencerTestLanguage.g:3246:1: ruleDefEnum2 : (enumLiteral_0= 'kw2' ) ;
    public final void ruleDefEnum2() throws RecognitionException {
        Token enumLiteral_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3246:13: ( (enumLiteral_0= 'kw2' ) )
            // PsiInternalSequencerTestLanguage.g:3247:2: (enumLiteral_0= 'kw2' )
            {
            // PsiInternalSequencerTestLanguage.g:3247:2: (enumLiteral_0= 'kw2' )
            // PsiInternalSequencerTestLanguage.g:3248:3: enumLiteral_0= 'kw2'
            {

            			markLeaf(elementTypeProvider.getDefEnum2_Kw2EnumLiteralDeclarationElementType());
            		
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_2); 

            			doneLeaf(enumLiteral_0);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDefEnum2"


    // $ANTLR start "ruleDefEnum3"
    // PsiInternalSequencerTestLanguage.g:3259:1: ruleDefEnum3 : (enumLiteral_0= 'kw3' ) ;
    public final void ruleDefEnum3() throws RecognitionException {
        Token enumLiteral_0=null;

        try {
            // PsiInternalSequencerTestLanguage.g:3259:13: ( (enumLiteral_0= 'kw3' ) )
            // PsiInternalSequencerTestLanguage.g:3260:2: (enumLiteral_0= 'kw3' )
            {
            // PsiInternalSequencerTestLanguage.g:3260:2: (enumLiteral_0= 'kw3' )
            // PsiInternalSequencerTestLanguage.g:3261:3: enumLiteral_0= 'kw3'
            {

            			markLeaf(elementTypeProvider.getDefEnum3_Kw3EnumLiteralDeclarationElementType());
            		
            enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_2); 

            			doneLeaf(enumLiteral_0);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleDefEnum3"

    // Delegated rules


    protected DFA32 dfa32 = new DFA32(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\3\uffff\1\4\1\uffff";
    static final String dfa_3s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\4\1\20\1\uffff\1\20\1\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\13\uffff\1\2",
            "",
            "\1\3\13\uffff\1\2",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1834:3: ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000480010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800012L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000B0000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000B0010L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030110L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000B0002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000CB0002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000CA0002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000C80002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000004B0000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000000000000002L});
    }


}