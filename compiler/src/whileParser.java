// $ANTLR 3.5.1 /home/axel/ESIR2/TLC/while.g 2024-12-09 12:31:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "ASSIGN_EXPR", "ASSIGN_VARS", 
		"BODY", "CALL", "COMMAND", "COMMANDS", "COMMENT", "CONS", "DEFINITION", 
		"Dec", "EXPR", "EXPRBASE", "EXPRS", "FOR", "FOREACH", "FUNC", "HD", "IF", 
		"INPUT", "INPUTSUB", "LIST", "Maj", "Min", "OUTPUT", "PARAM", "PROGRAM", 
		"SYMBOL", "Symbol", "TL", "VARIABLE", "Variable", "WHILE", "WS", "'%'", 
		"'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int ASSIGN=4;
	public static final int ASSIGN_EXPR=5;
	public static final int ASSIGN_VARS=6;
	public static final int BODY=7;
	public static final int CALL=8;
	public static final int COMMAND=9;
	public static final int COMMANDS=10;
	public static final int COMMENT=11;
	public static final int CONS=12;
	public static final int DEFINITION=13;
	public static final int Dec=14;
	public static final int EXPR=15;
	public static final int EXPRBASE=16;
	public static final int EXPRS=17;
	public static final int FOR=18;
	public static final int FOREACH=19;
	public static final int FUNC=20;
	public static final int HD=21;
	public static final int IF=22;
	public static final int INPUT=23;
	public static final int INPUTSUB=24;
	public static final int LIST=25;
	public static final int Maj=26;
	public static final int Min=27;
	public static final int OUTPUT=28;
	public static final int PARAM=29;
	public static final int PROGRAM=30;
	public static final int SYMBOL=31;
	public static final int Symbol=32;
	public static final int TL=33;
	public static final int VARIABLE=34;
	public static final int Variable=35;
	public static final int WHILE=36;
	public static final int WS=37;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public whileParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../grammar/while.g"; }


	public static class start_rule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start_rule"
	// /home/axel/ESIR2/TLC/while.g:58:1: start_rule : program ;
	public final whileParser.start_rule_return start_rule() throws RecognitionException {
		whileParser.start_rule_return retval = new whileParser.start_rule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;


		try {
			// /home/axel/ESIR2/TLC/while.g:58:12: ( program )
			// /home/axel/ESIR2/TLC/while.g:58:14: program
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_program_in_start_rule365);
			program1=program();
			state._fsp--;

			adaptor.addChild(root_0, program1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start_rule"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// /home/axel/ESIR2/TLC/while.g:61:1: vars : Variable ( ',' Variable )* -> ( Variable )+ ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable2=null;
		Token char_literal3=null;
		Token Variable4=null;

		Object Variable2_tree=null;
		Object char_literal3_tree=null;
		Object Variable4_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");

		try {
			// /home/axel/ESIR2/TLC/while.g:61:6: ( Variable ( ',' Variable )* -> ( Variable )+ )
			// /home/axel/ESIR2/TLC/while.g:61:8: Variable ( ',' Variable )*
			{
			Variable2=(Token)match(input,Variable,FOLLOW_Variable_in_vars374);  
			stream_Variable.add(Variable2);

			// /home/axel/ESIR2/TLC/while.g:61:16: ( ',' Variable )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==41) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:61:17: ',' Variable
					{
					char_literal3=(Token)match(input,41,FOLLOW_41_in_vars376);  
					stream_41.add(char_literal3);

					Variable4=(Token)match(input,Variable,FOLLOW_Variable_in_vars377);  
					stream_Variable.add(Variable4);

					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:30: -> ( Variable )+
			{
				if ( !(stream_Variable.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Variable.hasNext() ) {
					adaptor.addChild(root_0, stream_Variable.nextNode());
				}
				stream_Variable.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// /home/axel/ESIR2/TLC/while.g:62:1: inputSub : vars ;
	public final whileParser.inputSub_return inputSub() throws RecognitionException {
		whileParser.inputSub_return retval = new whileParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope vars5 =null;


		try {
			// /home/axel/ESIR2/TLC/while.g:62:10: ( vars )
			// /home/axel/ESIR2/TLC/while.g:62:12: vars
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_vars_in_inputSub389);
			vars5=vars();
			state._fsp--;

			adaptor.addChild(root_0, vars5.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inputSub"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// /home/axel/ESIR2/TLC/while.g:63:1: input : ( inputSub )? -> ^( PARAM ( inputSub )? ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub6 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// /home/axel/ESIR2/TLC/while.g:63:7: ( ( inputSub )? -> ^( PARAM ( inputSub )? ) )
			// /home/axel/ESIR2/TLC/while.g:63:9: ( inputSub )?
			{
			// /home/axel/ESIR2/TLC/while.g:63:9: ( inputSub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Variable) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:63:9: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input396);
					inputSub6=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub6.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:19: -> ^( PARAM ( inputSub )? )
			{
				// /home/axel/ESIR2/TLC/while.g:63:22: ^( PARAM ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
				// /home/axel/ESIR2/TLC/while.g:63:30: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// /home/axel/ESIR2/TLC/while.g:64:1: command : ( 'nop' | vars ':=' exprs -> ^( ASSIGN ^( ASSIGN_VARS vars ) ^( ASSIGN_EXPR exprs ) ) | s_if | s_while | s_for | s_foreach );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token string_literal9=null;
		ParserRuleReturnScope vars8 =null;
		ParserRuleReturnScope exprs10 =null;
		ParserRuleReturnScope s_if11 =null;
		ParserRuleReturnScope s_while12 =null;
		ParserRuleReturnScope s_for13 =null;
		ParserRuleReturnScope s_foreach14 =null;

		Object string_literal7_tree=null;
		Object string_literal9_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// /home/axel/ESIR2/TLC/while.g:64:9: ( 'nop' | vars ':=' exprs -> ^( ASSIGN ^( ASSIGN_VARS vars ) ^( ASSIGN_EXPR exprs ) ) | s_if | s_while | s_for | s_foreach )
			int alt3=6;
			switch ( input.LA(1) ) {
			case 58:
				{
				alt3=1;
				}
				break;
			case Variable:
				{
				alt3=2;
				}
				break;
			case 54:
				{
				alt3=3;
				}
				break;
			case 63:
				{
				alt3=4;
				}
				break;
			case 50:
				{
				alt3=5;
				}
				break;
			case 51:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:64:11: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal7=(Token)match(input,58,FOLLOW_58_in_command413); 
					string_literal7_tree = (Object)adaptor.create(string_literal7);
					adaptor.addChild(root_0, string_literal7_tree);

					}
					break;
				case 2 :
					// /home/axel/ESIR2/TLC/while.g:64:20: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command418);
					vars8=vars();
					state._fsp--;

					stream_vars.add(vars8.getTree());
					string_literal9=(Token)match(input,43,FOLLOW_43_in_command420);  
					stream_43.add(string_literal9);

					pushFollow(FOLLOW_exprs_in_command422);
					exprs10=exprs();
					state._fsp--;

					stream_exprs.add(exprs10.getTree());
					// AST REWRITE
					// elements: exprs, vars
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 64:36: -> ^( ASSIGN ^( ASSIGN_VARS vars ) ^( ASSIGN_EXPR exprs ) )
					{
						// /home/axel/ESIR2/TLC/while.g:64:39: ^( ASSIGN ^( ASSIGN_VARS vars ) ^( ASSIGN_EXPR exprs ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						// /home/axel/ESIR2/TLC/while.g:64:48: ^( ASSIGN_VARS vars )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_VARS, "ASSIGN_VARS"), root_2);
						adaptor.addChild(root_2, stream_vars.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/axel/ESIR2/TLC/while.g:64:68: ^( ASSIGN_EXPR exprs )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EXPR, "ASSIGN_EXPR"), root_2);
						adaptor.addChild(root_2, stream_exprs.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/axel/ESIR2/TLC/while.g:64:92: s_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_s_if_in_command444);
					s_if11=s_if();
					state._fsp--;

					adaptor.addChild(root_0, s_if11.getTree());

					}
					break;
				case 4 :
					// /home/axel/ESIR2/TLC/while.g:64:99: s_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_s_while_in_command448);
					s_while12=s_while();
					state._fsp--;

					adaptor.addChild(root_0, s_while12.getTree());

					}
					break;
				case 5 :
					// /home/axel/ESIR2/TLC/while.g:64:109: s_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_s_for_in_command452);
					s_for13=s_for();
					state._fsp--;

					adaptor.addChild(root_0, s_for13.getTree());

					}
					break;
				case 6 :
					// /home/axel/ESIR2/TLC/while.g:64:117: s_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_s_foreach_in_command456);
					s_foreach14=s_foreach();
					state._fsp--;

					adaptor.addChild(root_0, s_foreach14.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// /home/axel/ESIR2/TLC/while.g:65:1: commands : command ( ';' command )* -> ( command )+ ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal16=null;
		ParserRuleReturnScope command15 =null;
		ParserRuleReturnScope command17 =null;

		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// /home/axel/ESIR2/TLC/while.g:65:10: ( command ( ';' command )* -> ( command )+ )
			// /home/axel/ESIR2/TLC/while.g:65:12: command ( ';' command )*
			{
			pushFollow(FOLLOW_command_in_commands463);
			command15=command();
			state._fsp--;

			stream_command.add(command15.getTree());
			// /home/axel/ESIR2/TLC/while.g:65:19: ( ';' command )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==44) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:65:20: ';' command
					{
					char_literal16=(Token)match(input,44,FOLLOW_44_in_commands465);  
					stream_44.add(char_literal16);

					pushFollow(FOLLOW_command_in_commands466);
					command17=command();
					state._fsp--;

					stream_command.add(command17.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:33: -> ( command )+
			{
				if ( !(stream_command.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_command.hasNext() ) {
					adaptor.addChild(root_0, stream_command.nextTree());
				}
				stream_command.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// /home/axel/ESIR2/TLC/while.g:66:1: output : Variable ( ',' Variable )* -> ^( OUTPUT ( Variable )+ ) ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable18=null;
		Token char_literal19=null;
		Token Variable20=null;

		Object Variable18_tree=null;
		Object char_literal19_tree=null;
		Object Variable20_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");

		try {
			// /home/axel/ESIR2/TLC/while.g:66:9: ( Variable ( ',' Variable )* -> ^( OUTPUT ( Variable )+ ) )
			// /home/axel/ESIR2/TLC/while.g:66:11: Variable ( ',' Variable )*
			{
			Variable18=(Token)match(input,Variable,FOLLOW_Variable_in_output480);  
			stream_Variable.add(Variable18);

			// /home/axel/ESIR2/TLC/while.g:66:19: ( ',' Variable )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==41) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:66:20: ',' Variable
					{
					char_literal19=(Token)match(input,41,FOLLOW_41_in_output482);  
					stream_41.add(char_literal19);

					Variable20=(Token)match(input,Variable,FOLLOW_Variable_in_output483);  
					stream_Variable.add(Variable20);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:34: -> ^( OUTPUT ( Variable )+ )
			{
				// /home/axel/ESIR2/TLC/while.g:66:37: ^( OUTPUT ( Variable )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				if ( !(stream_Variable.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Variable.hasNext() ) {
					adaptor.addChild(root_1, stream_Variable.nextNode());
				}
				stream_Variable.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "output"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// /home/axel/ESIR2/TLC/while.g:67:1: definition : 'read' input '%' commands '%' 'write' output -> ^( BODY input ^( COMMANDS commands ) output ) ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal21=null;
		Token char_literal23=null;
		Token char_literal25=null;
		Token string_literal26=null;
		ParserRuleReturnScope input22 =null;
		ParserRuleReturnScope commands24 =null;
		ParserRuleReturnScope output27 =null;

		Object string_literal21_tree=null;
		Object char_literal23_tree=null;
		Object char_literal25_tree=null;
		Object string_literal26_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/axel/ESIR2/TLC/while.g:67:12: ( 'read' input '%' commands '%' 'write' output -> ^( BODY input ^( COMMANDS commands ) output ) )
			// /home/axel/ESIR2/TLC/while.g:67:14: 'read' input '%' commands '%' 'write' output
			{
			string_literal21=(Token)match(input,60,FOLLOW_60_in_definition500);  
			stream_60.add(string_literal21);

			pushFollow(FOLLOW_input_in_definition502);
			input22=input();
			state._fsp--;

			stream_input.add(input22.getTree());
			char_literal23=(Token)match(input,38,FOLLOW_38_in_definition504);  
			stream_38.add(char_literal23);

			pushFollow(FOLLOW_commands_in_definition506);
			commands24=commands();
			state._fsp--;

			stream_commands.add(commands24.getTree());
			char_literal25=(Token)match(input,38,FOLLOW_38_in_definition508);  
			stream_38.add(char_literal25);

			string_literal26=(Token)match(input,64,FOLLOW_64_in_definition510);  
			stream_64.add(string_literal26);

			pushFollow(FOLLOW_output_in_definition512);
			output27=output();
			state._fsp--;

			stream_output.add(output27.getTree());
			// AST REWRITE
			// elements: output, input, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:59: -> ^( BODY input ^( COMMANDS commands ) output )
			{
				// /home/axel/ESIR2/TLC/while.g:67:62: ^( BODY input ^( COMMANDS commands ) output )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				// /home/axel/ESIR2/TLC/while.g:67:75: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_output.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// /home/axel/ESIR2/TLC/while.g:68:1: function : 'function' i= Symbol ':' definition -> ^( FUNC $i definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token string_literal28=null;
		Token char_literal29=null;
		ParserRuleReturnScope definition30 =null;

		Object i_tree=null;
		Object string_literal28_tree=null;
		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// /home/axel/ESIR2/TLC/while.g:68:10: ( 'function' i= Symbol ':' definition -> ^( FUNC $i definition ) )
			// /home/axel/ESIR2/TLC/while.g:68:13: 'function' i= Symbol ':' definition
			{
			string_literal28=(Token)match(input,52,FOLLOW_52_in_function536);  
			stream_52.add(string_literal28);

			i=(Token)match(input,Symbol,FOLLOW_Symbol_in_function542);  
			stream_Symbol.add(i);

			char_literal29=(Token)match(input,42,FOLLOW_42_in_function544);  
			stream_42.add(char_literal29);

			pushFollow(FOLLOW_definition_in_function546);
			definition30=definition();
			state._fsp--;

			stream_definition.add(definition30.getTree());
			// AST REWRITE
			// elements: i, definition
			// token labels: i
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:50: -> ^( FUNC $i definition )
			{
				// /home/axel/ESIR2/TLC/while.g:68:54: ^( FUNC $i definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/axel/ESIR2/TLC/while.g:69:1: program : ( function )+ -> ^( PROGRAM ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function31 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// /home/axel/ESIR2/TLC/while.g:69:10: ( ( function )+ -> ^( PROGRAM ( function )+ ) )
			// /home/axel/ESIR2/TLC/while.g:69:13: ( function )+
			{
			// /home/axel/ESIR2/TLC/while.g:69:13: ( function )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==52) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:69:13: function
					{
					pushFollow(FOLLOW_function_in_program567);
					function31=function();
					state._fsp--;

					stream_function.add(function31.getTree());
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 69:23: -> ^( PROGRAM ( function )+ )
			{
				// /home/axel/ESIR2/TLC/while.g:69:28: ^( PROGRAM ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class s_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "s_if"
	// /home/axel/ESIR2/TLC/while.g:70:1: s_if : 'if' expr 'then' s_then ( 'else' s_then )? 'fi' -> ^( IF expr ( s_then )+ ) ;
	public final whileParser.s_if_return s_if() throws RecognitionException {
		whileParser.s_if_return retval = new whileParser.s_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal32=null;
		Token string_literal34=null;
		Token string_literal36=null;
		Token string_literal38=null;
		ParserRuleReturnScope expr33 =null;
		ParserRuleReturnScope s_then35 =null;
		ParserRuleReturnScope s_then37 =null;

		Object string_literal32_tree=null;
		Object string_literal34_tree=null;
		Object string_literal36_tree=null;
		Object string_literal38_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_s_then=new RewriteRuleSubtreeStream(adaptor,"rule s_then");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/axel/ESIR2/TLC/while.g:70:6: ( 'if' expr 'then' s_then ( 'else' s_then )? 'fi' -> ^( IF expr ( s_then )+ ) )
			// /home/axel/ESIR2/TLC/while.g:70:8: 'if' expr 'then' s_then ( 'else' s_then )? 'fi'
			{
			string_literal32=(Token)match(input,54,FOLLOW_54_in_s_if586);  
			stream_54.add(string_literal32);

			pushFollow(FOLLOW_expr_in_s_if588);
			expr33=expr();
			state._fsp--;

			stream_expr.add(expr33.getTree());
			string_literal34=(Token)match(input,61,FOLLOW_61_in_s_if591);  
			stream_61.add(string_literal34);

			pushFollow(FOLLOW_s_then_in_s_if593);
			s_then35=s_then();
			state._fsp--;

			stream_s_then.add(s_then35.getTree());
			// /home/axel/ESIR2/TLC/while.g:70:33: ( 'else' s_then )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==48) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:70:34: 'else' s_then
					{
					string_literal36=(Token)match(input,48,FOLLOW_48_in_s_if596);  
					stream_48.add(string_literal36);

					pushFollow(FOLLOW_s_then_in_s_if598);
					s_then37=s_then();
					state._fsp--;

					stream_s_then.add(s_then37.getTree());
					}
					break;

			}

			string_literal38=(Token)match(input,49,FOLLOW_49_in_s_if602);  
			stream_49.add(string_literal38);

			// AST REWRITE
			// elements: s_then, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:55: -> ^( IF expr ( s_then )+ )
			{
				// /home/axel/ESIR2/TLC/while.g:70:58: ^( IF expr ( s_then )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				if ( !(stream_s_then.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_s_then.hasNext() ) {
					adaptor.addChild(root_1, stream_s_then.nextTree());
				}
				stream_s_then.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s_if"


	public static class s_while_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "s_while"
	// /home/axel/ESIR2/TLC/while.g:71:1: s_while : 'while' expr 'do' commands 'od' -> ^( WHILE expr ^( COMMANDS commands ) ) ;
	public final whileParser.s_while_return s_while() throws RecognitionException {
		whileParser.s_while_return retval = new whileParser.s_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal43=null;
		ParserRuleReturnScope expr40 =null;
		ParserRuleReturnScope commands42 =null;

		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal43_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/axel/ESIR2/TLC/while.g:71:9: ( 'while' expr 'do' commands 'od' -> ^( WHILE expr ^( COMMANDS commands ) ) )
			// /home/axel/ESIR2/TLC/while.g:71:11: 'while' expr 'do' commands 'od'
			{
			string_literal39=(Token)match(input,63,FOLLOW_63_in_s_while620);  
			stream_63.add(string_literal39);

			pushFollow(FOLLOW_expr_in_s_while622);
			expr40=expr();
			state._fsp--;

			stream_expr.add(expr40.getTree());
			string_literal41=(Token)match(input,47,FOLLOW_47_in_s_while624);  
			stream_47.add(string_literal41);

			pushFollow(FOLLOW_commands_in_s_while626);
			commands42=commands();
			state._fsp--;

			stream_commands.add(commands42.getTree());
			string_literal43=(Token)match(input,59,FOLLOW_59_in_s_while628);  
			stream_59.add(string_literal43);

			// AST REWRITE
			// elements: expr, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:43: -> ^( WHILE expr ^( COMMANDS commands ) )
			{
				// /home/axel/ESIR2/TLC/while.g:71:46: ^( WHILE expr ^( COMMANDS commands ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				// /home/axel/ESIR2/TLC/while.g:71:59: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s_while"


	public static class s_then_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "s_then"
	// /home/axel/ESIR2/TLC/while.g:72:1: s_then : commands -> ^( COMMANDS commands ) ;
	public final whileParser.s_then_return s_then() throws RecognitionException {
		whileParser.s_then_return retval = new whileParser.s_then_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope commands44 =null;

		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/axel/ESIR2/TLC/while.g:72:8: ( commands -> ^( COMMANDS commands ) )
			// /home/axel/ESIR2/TLC/while.g:72:10: commands
			{
			pushFollow(FOLLOW_commands_in_s_then649);
			commands44=commands();
			state._fsp--;

			stream_commands.add(commands44.getTree());
			// AST REWRITE
			// elements: commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:19: -> ^( COMMANDS commands )
			{
				// /home/axel/ESIR2/TLC/while.g:72:22: ^( COMMANDS commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s_then"


	public static class s_for_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "s_for"
	// /home/axel/ESIR2/TLC/while.g:73:1: s_for : 'for' expr 'do' commands 'od' -> ^( FOR expr ^( COMMANDS commands ) ) ;
	public final whileParser.s_for_return s_for() throws RecognitionException {
		whileParser.s_for_return retval = new whileParser.s_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal45=null;
		Token string_literal47=null;
		Token string_literal49=null;
		ParserRuleReturnScope expr46 =null;
		ParserRuleReturnScope commands48 =null;

		Object string_literal45_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/axel/ESIR2/TLC/while.g:73:7: ( 'for' expr 'do' commands 'od' -> ^( FOR expr ^( COMMANDS commands ) ) )
			// /home/axel/ESIR2/TLC/while.g:73:9: 'for' expr 'do' commands 'od'
			{
			string_literal45=(Token)match(input,50,FOLLOW_50_in_s_for664);  
			stream_50.add(string_literal45);

			pushFollow(FOLLOW_expr_in_s_for666);
			expr46=expr();
			state._fsp--;

			stream_expr.add(expr46.getTree());
			string_literal47=(Token)match(input,47,FOLLOW_47_in_s_for668);  
			stream_47.add(string_literal47);

			pushFollow(FOLLOW_commands_in_s_for670);
			commands48=commands();
			state._fsp--;

			stream_commands.add(commands48.getTree());
			string_literal49=(Token)match(input,59,FOLLOW_59_in_s_for672);  
			stream_59.add(string_literal49);

			// AST REWRITE
			// elements: commands, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 73:39: -> ^( FOR expr ^( COMMANDS commands ) )
			{
				// /home/axel/ESIR2/TLC/while.g:73:42: ^( FOR expr ^( COMMANDS commands ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				// /home/axel/ESIR2/TLC/while.g:73:53: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s_for"


	public static class s_foreach_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "s_foreach"
	// /home/axel/ESIR2/TLC/while.g:74:1: s_foreach : 'foreach' i= Variable 'in' expr 'do' commands 'od' -> ^( FOREACH ^( VARIABLE $i) expr ^( COMMANDS commands ) ) ;
	public final whileParser.s_foreach_return s_foreach() throws RecognitionException {
		whileParser.s_foreach_return retval = new whileParser.s_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token string_literal50=null;
		Token string_literal51=null;
		Token string_literal53=null;
		Token string_literal55=null;
		ParserRuleReturnScope expr52 =null;
		ParserRuleReturnScope commands54 =null;

		Object i_tree=null;
		Object string_literal50_tree=null;
		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		Object string_literal55_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/axel/ESIR2/TLC/while.g:74:11: ( 'foreach' i= Variable 'in' expr 'do' commands 'od' -> ^( FOREACH ^( VARIABLE $i) expr ^( COMMANDS commands ) ) )
			// /home/axel/ESIR2/TLC/while.g:74:13: 'foreach' i= Variable 'in' expr 'do' commands 'od'
			{
			string_literal50=(Token)match(input,51,FOLLOW_51_in_s_foreach693);  
			stream_51.add(string_literal50);

			i=(Token)match(input,Variable,FOLLOW_Variable_in_s_foreach699);  
			stream_Variable.add(i);

			string_literal51=(Token)match(input,55,FOLLOW_55_in_s_foreach701);  
			stream_55.add(string_literal51);

			pushFollow(FOLLOW_expr_in_s_foreach703);
			expr52=expr();
			state._fsp--;

			stream_expr.add(expr52.getTree());
			string_literal53=(Token)match(input,47,FOLLOW_47_in_s_foreach705);  
			stream_47.add(string_literal53);

			pushFollow(FOLLOW_commands_in_s_foreach707);
			commands54=commands();
			state._fsp--;

			stream_commands.add(commands54.getTree());
			string_literal55=(Token)match(input,59,FOLLOW_59_in_s_foreach709);  
			stream_59.add(string_literal55);

			// AST REWRITE
			// elements: expr, i, commands
			// token labels: i
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:65: -> ^( FOREACH ^( VARIABLE $i) expr ^( COMMANDS commands ) )
			{
				// /home/axel/ESIR2/TLC/while.g:74:68: ^( FOREACH ^( VARIABLE $i) expr ^( COMMANDS commands ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// /home/axel/ESIR2/TLC/while.g:74:78: ^( VARIABLE $i)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_2);
				adaptor.addChild(root_2, stream_i.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_expr.nextTree());
				// /home/axel/ESIR2/TLC/while.g:74:98: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "s_foreach"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// /home/axel/ESIR2/TLC/while.g:75:1: exprs : expr ( ',' expr )* -> ( expr )+ ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal57=null;
		ParserRuleReturnScope expr56 =null;
		ParserRuleReturnScope expr58 =null;

		Object char_literal57_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/axel/ESIR2/TLC/while.g:75:7: ( expr ( ',' expr )* -> ( expr )+ )
			// /home/axel/ESIR2/TLC/while.g:75:9: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_exprs737);
			expr56=expr();
			state._fsp--;

			stream_expr.add(expr56.getTree());
			// /home/axel/ESIR2/TLC/while.g:75:14: ( ',' expr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==41) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:75:15: ',' expr
					{
					char_literal57=(Token)match(input,41,FOLLOW_41_in_exprs740);  
					stream_41.add(char_literal57);

					pushFollow(FOLLOW_expr_in_exprs741);
					expr58=expr();
					state._fsp--;

					stream_expr.add(expr58.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:25: -> ( expr )+
			{
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/axel/ESIR2/TLC/while.g:76:1: expr : exprBase ( '=?' exprBase )? -> ^( EXPR ( exprBase )+ ) ;
	public final whileParser.expr_return expr() throws RecognitionException {
		whileParser.expr_return retval = new whileParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal60=null;
		ParserRuleReturnScope exprBase59 =null;
		ParserRuleReturnScope exprBase61 =null;

		Object string_literal60_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// /home/axel/ESIR2/TLC/while.g:76:6: ( exprBase ( '=?' exprBase )? -> ^( EXPR ( exprBase )+ ) )
			// /home/axel/ESIR2/TLC/while.g:76:9: exprBase ( '=?' exprBase )?
			{
			pushFollow(FOLLOW_exprBase_in_expr756);
			exprBase59=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase59.getTree());
			// /home/axel/ESIR2/TLC/while.g:76:18: ( '=?' exprBase )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==45) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:76:19: '=?' exprBase
					{
					string_literal60=(Token)match(input,45,FOLLOW_45_in_expr759);  
					stream_45.add(string_literal60);

					pushFollow(FOLLOW_exprBase_in_expr761);
					exprBase61=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:35: -> ^( EXPR ( exprBase )+ )
			{
				// /home/axel/ESIR2/TLC/while.g:76:38: ^( EXPR ( exprBase )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				if ( !(stream_exprBase.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exprBase.hasNext() ) {
					adaptor.addChild(root_1, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// /home/axel/ESIR2/TLC/while.g:77:1: exprBase : ( 'nil' -> ^( 'nil' ) |v= Variable -> ^( VARIABLE $v) |s= Symbol -> ^( SYMBOL $s) | '(' 'cons' lexpr ')' -> ^( CONS lexpr ) | '(' 'list' lexpr ')' -> ^( LIST lexpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' s= Symbol ( lexpr )? ')' -> ^( CALL $s ( lexpr )? ) );
	public final whileParser.exprBase_return exprBase() throws RecognitionException {
		whileParser.exprBase_return retval = new whileParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token s=null;
		Token string_literal62=null;
		Token char_literal63=null;
		Token string_literal64=null;
		Token char_literal66=null;
		Token char_literal67=null;
		Token string_literal68=null;
		Token char_literal70=null;
		Token char_literal71=null;
		Token string_literal72=null;
		Token char_literal74=null;
		Token char_literal75=null;
		Token string_literal76=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		ParserRuleReturnScope lexpr65 =null;
		ParserRuleReturnScope lexpr69 =null;
		ParserRuleReturnScope exprBase73 =null;
		ParserRuleReturnScope exprBase77 =null;
		ParserRuleReturnScope lexpr80 =null;

		Object v_tree=null;
		Object s_tree=null;
		Object string_literal62_tree=null;
		Object char_literal63_tree=null;
		Object string_literal64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal67_tree=null;
		Object string_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal71_tree=null;
		Object string_literal72_tree=null;
		Object char_literal74_tree=null;
		Object char_literal75_tree=null;
		Object string_literal76_tree=null;
		Object char_literal78_tree=null;
		Object char_literal79_tree=null;
		Object char_literal81_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// /home/axel/ESIR2/TLC/while.g:77:11: ( 'nil' -> ^( 'nil' ) |v= Variable -> ^( VARIABLE $v) |s= Symbol -> ^( SYMBOL $s) | '(' 'cons' lexpr ')' -> ^( CONS lexpr ) | '(' 'list' lexpr ')' -> ^( LIST lexpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' s= Symbol ( lexpr )? ')' -> ^( CALL $s ( lexpr )? ) )
			int alt11=8;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt11=1;
				}
				break;
			case Variable:
				{
				alt11=2;
				}
				break;
			case Symbol:
				{
				alt11=3;
				}
				break;
			case 39:
				{
				switch ( input.LA(2) ) {
				case 46:
					{
					alt11=4;
					}
					break;
				case 56:
					{
					alt11=5;
					}
					break;
				case 53:
					{
					alt11=6;
					}
					break;
				case 62:
					{
					alt11=7;
					}
					break;
				case Symbol:
					{
					alt11=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:77:13: 'nil'
					{
					string_literal62=(Token)match(input,57,FOLLOW_57_in_exprBase780);  
					stream_57.add(string_literal62);

					// AST REWRITE
					// elements: 57
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:19: -> ^( 'nil' )
					{
						// /home/axel/ESIR2/TLC/while.g:77:22: ^( 'nil' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_57.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/axel/ESIR2/TLC/while.g:77:32: v= Variable
					{
					v=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase793);  
					stream_Variable.add(v);

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:45: -> ^( VARIABLE $v)
					{
						// /home/axel/ESIR2/TLC/while.g:77:48: ^( VARIABLE $v)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/axel/ESIR2/TLC/while.g:77:64: s= Symbol
					{
					s=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase807);  
					stream_Symbol.add(s);

					// AST REWRITE
					// elements: s
					// token labels: s
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:73: -> ^( SYMBOL $s)
					{
						// /home/axel/ESIR2/TLC/while.g:77:76: ^( SYMBOL $s)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYMBOL, "SYMBOL"), root_1);
						adaptor.addChild(root_1, stream_s.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/axel/ESIR2/TLC/while.g:78:4: '(' 'cons' lexpr ')'
					{
					char_literal63=(Token)match(input,39,FOLLOW_39_in_exprBase821);  
					stream_39.add(char_literal63);

					string_literal64=(Token)match(input,46,FOLLOW_46_in_exprBase823);  
					stream_46.add(string_literal64);

					pushFollow(FOLLOW_lexpr_in_exprBase825);
					lexpr65=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr65.getTree());
					char_literal66=(Token)match(input,40,FOLLOW_40_in_exprBase827);  
					stream_40.add(char_literal66);

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:25: -> ^( CONS lexpr )
					{
						// /home/axel/ESIR2/TLC/while.g:78:28: ^( CONS lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/axel/ESIR2/TLC/while.g:78:43: '(' 'list' lexpr ')'
					{
					char_literal67=(Token)match(input,39,FOLLOW_39_in_exprBase838);  
					stream_39.add(char_literal67);

					string_literal68=(Token)match(input,56,FOLLOW_56_in_exprBase840);  
					stream_56.add(string_literal68);

					pushFollow(FOLLOW_lexpr_in_exprBase842);
					lexpr69=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr69.getTree());
					char_literal70=(Token)match(input,40,FOLLOW_40_in_exprBase844);  
					stream_40.add(char_literal70);

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:64: -> ^( LIST lexpr )
					{
						// /home/axel/ESIR2/TLC/while.g:78:69: ^( LIST lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /home/axel/ESIR2/TLC/while.g:79:4: '(' 'hd' exprBase ')'
					{
					char_literal71=(Token)match(input,39,FOLLOW_39_in_exprBase857);  
					stream_39.add(char_literal71);

					string_literal72=(Token)match(input,53,FOLLOW_53_in_exprBase859);  
					stream_53.add(string_literal72);

					pushFollow(FOLLOW_exprBase_in_exprBase861);
					exprBase73=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase73.getTree());
					char_literal74=(Token)match(input,40,FOLLOW_40_in_exprBase863);  
					stream_40.add(char_literal74);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 79:26: -> ^( HD exprBase )
					{
						// /home/axel/ESIR2/TLC/while.g:79:30: ^( HD exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /home/axel/ESIR2/TLC/while.g:79:46: '(' 'tl' exprBase ')'
					{
					char_literal75=(Token)match(input,39,FOLLOW_39_in_exprBase874);  
					stream_39.add(char_literal75);

					string_literal76=(Token)match(input,62,FOLLOW_62_in_exprBase876);  
					stream_62.add(string_literal76);

					pushFollow(FOLLOW_exprBase_in_exprBase878);
					exprBase77=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase77.getTree());
					char_literal78=(Token)match(input,40,FOLLOW_40_in_exprBase880);  
					stream_40.add(char_literal78);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 79:68: -> ^( TL exprBase )
					{
						// /home/axel/ESIR2/TLC/while.g:79:71: ^( TL exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /home/axel/ESIR2/TLC/while.g:80:4: '(' s= Symbol ( lexpr )? ')'
					{
					char_literal79=(Token)match(input,39,FOLLOW_39_in_exprBase893);  
					stream_39.add(char_literal79);

					s=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase897);  
					stream_Symbol.add(s);

					// /home/axel/ESIR2/TLC/while.g:80:17: ( lexpr )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==Symbol||LA10_0==Variable||LA10_0==39||LA10_0==57) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/axel/ESIR2/TLC/while.g:80:17: lexpr
							{
							pushFollow(FOLLOW_lexpr_in_exprBase899);
							lexpr80=lexpr();
							state._fsp--;

							stream_lexpr.add(lexpr80.getTree());
							}
							break;

					}

					char_literal81=(Token)match(input,40,FOLLOW_40_in_exprBase902);  
					stream_40.add(char_literal81);

					// AST REWRITE
					// elements: lexpr, s
					// token labels: s
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 80:28: -> ^( CALL $s ( lexpr )? )
					{
						// /home/axel/ESIR2/TLC/while.g:80:32: ^( CALL $s ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_s.nextNode());
						// /home/axel/ESIR2/TLC/while.g:80:42: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprBase"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// /home/axel/ESIR2/TLC/while.g:81:1: lexpr : exprBase ( exprBase )* ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase82 =null;
		ParserRuleReturnScope exprBase83 =null;


		try {
			// /home/axel/ESIR2/TLC/while.g:81:7: ( exprBase ( exprBase )* )
			// /home/axel/ESIR2/TLC/while.g:81:9: exprBase ( exprBase )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprBase_in_lexpr921);
			exprBase82=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase82.getTree());

			// /home/axel/ESIR2/TLC/while.g:81:18: ( exprBase )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==Symbol||LA12_0==Variable||LA12_0==39||LA12_0==57) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/axel/ESIR2/TLC/while.g:81:19: exprBase
					{
					pushFollow(FOLLOW_exprBase_in_lexpr924);
					exprBase83=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase83.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_program_in_start_rule365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars374 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_vars376 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_vars377 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_vars_in_inputSub389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_command413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command418 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command420 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_exprs_in_command422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_s_if_in_command444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_s_while_in_command448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_s_for_in_command452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_s_foreach_in_command456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands463 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_commands465 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_command_in_commands466 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_Variable_in_output480 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_output482 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_output483 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_60_in_definition500 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_input_in_definition502 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition504 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_commands_in_definition506 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_definition510 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_output_in_definition512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_function536 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Symbol_in_function542 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_function544 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_definition_in_function546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program567 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_54_in_s_if586 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_expr_in_s_if588 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_s_if591 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_s_then_in_s_if593 = new BitSet(new long[]{0x0003000000000000L});
	public static final BitSet FOLLOW_48_in_s_if596 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_s_then_in_s_if598 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_s_if602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_s_while620 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_expr_in_s_while622 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_s_while624 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_commands_in_s_while626 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_s_while628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commands_in_s_then649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_s_for664 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_expr_in_s_for666 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_s_for668 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_commands_in_s_for670 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_s_for672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_s_foreach693 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Variable_in_s_foreach699 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_s_foreach701 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_expr_in_s_foreach703 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_s_foreach705 = new BitSet(new long[]{0x844C000800000000L});
	public static final BitSet FOLLOW_commands_in_s_foreach707 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_s_foreach709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprs737 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_exprs740 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_expr_in_exprs741 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_exprBase_in_expr756 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_expr759 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_exprBase_in_expr761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_exprBase780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_exprBase821 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_exprBase823 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase825 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_exprBase838 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_exprBase840 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase842 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_exprBase857 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_exprBase859 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase861 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_exprBase874 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_exprBase876 = new BitSet(new long[]{0x0200008900000000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase878 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_exprBase893 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase897 = new BitSet(new long[]{0x0200018900000000L});
	public static final BitSet FOLLOW_lexpr_in_exprBase899 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lexpr921 = new BitSet(new long[]{0x0200008900000002L});
	public static final BitSet FOLLOW_exprBase_in_lexpr924 = new BitSet(new long[]{0x0200008900000002L});
}
