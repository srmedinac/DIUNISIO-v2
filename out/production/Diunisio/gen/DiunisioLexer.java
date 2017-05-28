// Generated from C:/Users/smedi/Desktop/Diunisio_V1.0/Diunisio/out/production/Diunisio\Diunisio.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ALGORITMO=2, TERMINA=3, ENTONCES=4, O=5, Y=6, IGUAL=7, DIFERENTE=8, 
		MAYOR=9, MENOR=10, MAY_IGUAL=11, MEN_IGUAL=12, SUMA=13, MENOS=14, MULT=15, 
		DIV=16, MOD=17, POTENCIA=18, NO=19, DEF=20, RETORNAR=21, INT=22, FLOAT=23, 
		STRING=24, BOOL=25, MATRIZ=26, VECTOR=27, PCOMA=28, ASIGNAR=29, PAREN_AP=30, 
		PAREN_CI=31, LLAVEIZ=32, LLAVEDE=33, ANGIZ=34, ANGDE=35, COMA=36, DOSPUNTOS=37, 
		VERDADERO=38, FALSO=39, NULO=40, SI=41, SI_NO=42, MIENTRAS=43, SELECCIONAR=44, 
		CASO=45, ROMPER=46, HACER=47, PARA=48, DEFECTO=49, IDENTIFICADOR=50, ENTERO=51, 
		PUBLICO=52, PRIVADO=53, PROTEGIDO=54, ESTATICO=55, FINAL=56, ABSTRACTO=57, 
		REAL=58, COMPLEJO=59, CADENA=60, ESPACIO=61, OTRO=62, NUEVO=63, OBJETOID=64, 
		CLASEID=65, PUNTO=66, ESTO=67, IMPLEMENTA=68, EXTIENDE=69, SUPERCLASE=70, 
		INTERFAZ=71, CLASE=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", "DIFERENTE", 
		"MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", "MULT", "DIV", 
		"MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", "STRING", 
		"BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", "PAREN_CI", 
		"LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", "VERDADERO", 
		"FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", "CASO", "ROMPER", 
		"HACER", "PARA", "DEFECTO", "IDENTIFICADOR", "ENTERO", "PUBLICO", "PRIVADO", 
		"PROTEGIDO", "ESTATICO", "FINAL", "ABSTRACTO", "REAL", "COMPLEJO", "CADENA", 
		"ESPACIO", "OTRO", "NUEVO", "OBJETOID", "CLASEID", "PUNTO", "ESTO", "IMPLEMENTA", 
		"EXTIENDE", "SUPERCLASE", "INTERFAZ", "CLASE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'ALGORITMO'", "'..'", "'entonces'", "'||'", "'&&'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'!'", "'def'", "'retornar'", "'entero'", "'decimal'", "'cadena'", 
		"'booleano'", "'matriz'", "'vector'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "':'", "'verdadero'", "'falso'", "'nulo'", 
		"'si'", "'si_no'", "'mientras'", "'seleccionar'", "'caso'", "'romper'", 
		"'hacer'", "'para'", "'defecto'", null, null, "'publico'", "'privado'", 
		"'protegido'", "'estatico'", "'final'", "'abstracto'", null, null, null, 
		null, null, "'nuevo'", null, null, "'.'", "'esto'", "'implementa'", "'extiende'", 
		"'superclase'", "'interfaz'", "'clase'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", 
		"DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", 
		"MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", 
		"STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", 
		"PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", 
		"VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", 
		"CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "IDENTIFICADOR", "ENTERO", 
		"PUBLICO", "PRIVADO", "PROTEGIDO", "ESTATICO", "FINAL", "ABSTRACTO", "REAL", 
		"COMPLEJO", "CADENA", "ESPACIO", "OTRO", "NUEVO", "OBJETOID", "CLASEID", 
		"PUNTO", "ESTO", "IMPLEMENTA", "EXTIENDE", "SUPERCLASE", "INTERFAZ", "CLASE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DiunisioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u023f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\7\2\u0096\n\2\f\2\16\2\u0099\13\2\3\2\3\2\3\2\3\2\7\2\u009f"+
		"\n\2\f\2\16\2\u00a2\13\2\3\2\3\2\5\2\u00a6\n\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0186"+
		"\n\63\f\63\16\63\u0189\13\63\3\64\6\64\u018c\n\64\r\64\16\64\u018d\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\7;\u01c4"+
		"\n;\f;\16;\u01c7\13;\3;\3;\7;\u01cb\n;\f;\16;\u01ce\13;\3;\3;\5;\u01d2"+
		"\n;\3;\6;\u01d5\n;\r;\16;\u01d6\5;\u01d9\n;\3<\3<\5<\u01dd\n<\3<\3<\3"+
		"<\5<\u01e2\n<\3<\3<\3=\3=\3=\3=\7=\u01ea\n=\f=\16=\u01ed\13=\3=\3=\3>"+
		"\3>\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\7A\u01ff\nA\fA\16A\u0202\13A\3"+
		"B\3B\7B\u0206\nB\fB\16B\u0209\13B\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3\u00a0\2J\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\3\2\r\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2GGg"+
		"g\4\2--//\5\2--//~~\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\3\2c|\3\2C\\\2"+
		"\u024f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u00a5\3\2\2\2\5\u00a9"+
		"\3\2\2\2\7\u00b3\3\2\2\2\t\u00b6\3\2\2\2\13\u00bf\3\2\2\2\r\u00c2\3\2"+
		"\2\2\17\u00c5\3\2\2\2\21\u00c8\3\2\2\2\23\u00cb\3\2\2\2\25\u00cd\3\2\2"+
		"\2\27\u00cf\3\2\2\2\31\u00d2\3\2\2\2\33\u00d5\3\2\2\2\35\u00d7\3\2\2\2"+
		"\37\u00d9\3\2\2\2!\u00db\3\2\2\2#\u00dd\3\2\2\2%\u00df\3\2\2\2\'\u00e1"+
		"\3\2\2\2)\u00e3\3\2\2\2+\u00e7\3\2\2\2-\u00f0\3\2\2\2/\u00f7\3\2\2\2\61"+
		"\u00ff\3\2\2\2\63\u0106\3\2\2\2\65\u010f\3\2\2\2\67\u0116\3\2\2\29\u011d"+
		"\3\2\2\2;\u011f\3\2\2\2=\u0121\3\2\2\2?\u0123\3\2\2\2A\u0125\3\2\2\2C"+
		"\u0127\3\2\2\2E\u0129\3\2\2\2G\u012b\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2"+
		"\2\2M\u0131\3\2\2\2O\u013b\3\2\2\2Q\u0141\3\2\2\2S\u0146\3\2\2\2U\u0149"+
		"\3\2\2\2W\u014f\3\2\2\2Y\u0158\3\2\2\2[\u0164\3\2\2\2]\u0169\3\2\2\2_"+
		"\u0170\3\2\2\2a\u0176\3\2\2\2c\u017b\3\2\2\2e\u0183\3\2\2\2g\u018b\3\2"+
		"\2\2i\u018f\3\2\2\2k\u0197\3\2\2\2m\u019f\3\2\2\2o\u01a9\3\2\2\2q\u01b2"+
		"\3\2\2\2s\u01b8\3\2\2\2u\u01c5\3\2\2\2w\u01dc\3\2\2\2y\u01e5\3\2\2\2{"+
		"\u01f0\3\2\2\2}\u01f4\3\2\2\2\177\u01f6\3\2\2\2\u0081\u01fc\3\2\2\2\u0083"+
		"\u0203\3\2\2\2\u0085\u020a\3\2\2\2\u0087\u020c\3\2\2\2\u0089\u0211\3\2"+
		"\2\2\u008b\u021c\3\2\2\2\u008d\u0225\3\2\2\2\u008f\u0230\3\2\2\2\u0091"+
		"\u0239\3\2\2\2\u0093\u0097\7%\2\2\u0094\u0096\n\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u00a6\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7"+
		",\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a6\7\61\2\2\u00a5"+
		"\u0093\3\2\2\2\u00a5\u009a\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\2"+
		"\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac"+
		"\7I\2\2\u00ac\u00ad\7Q\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af\7K\2\2\u00af"+
		"\u00b0\7V\2\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7Q\2\2\u00b2\6\3\2\2\2\u00b3"+
		"\u00b4\7\60\2\2\u00b4\u00b5\7\60\2\2\u00b5\b\3\2\2\2\u00b6\u00b7\7g\2"+
		"\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\n\3\2\2\2\u00bf\u00c0\7~\2\2\u00c0\u00c1\7~\2\2\u00c1\f\3\2\2\2\u00c2"+
		"\u00c3\7(\2\2\u00c3\u00c4\7(\2\2\u00c4\16\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6"+
		"\u00c7\7?\2\2\u00c7\20\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00ca"+
		"\22\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\24\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce"+
		"\26\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1\7?\2\2\u00d1\30\3\2\2\2\u00d2"+
		"\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4\32\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6"+
		"\34\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7,\2\2\u00da"+
		" \3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7\'\2\2\u00de"+
		"$\3\2\2\2\u00df\u00e0\7`\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2("+
		"\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7h\2\2\u00e6"+
		"*\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7c\2\2"+
		"\u00ee\u00ef\7t\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2"+
		"\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa"+
		"\7e\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd\7c\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\60\3\2\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7c\2\2\u0101"+
		"\u0102\7f\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105\7c\2\2"+
		"\u0105\62\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108\7q\2\2\u0108\u0109\7"+
		"q\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c\7c\2\2\u010c\u010d"+
		"\7p\2\2\u010d\u010e\7q\2\2\u010e\64\3\2\2\2\u010f\u0110\7o\2\2\u0110\u0111"+
		"\7c\2\2\u0111\u0112\7v\2\2\u0112\u0113\7t\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7|\2\2\u0115\66\3\2\2\2\u0116\u0117\7x\2\2\u0117\u0118\7g\2\2\u0118"+
		"\u0119\7e\2\2\u0119\u011a\7v\2\2\u011a\u011b\7q\2\2\u011b\u011c\7t\2\2"+
		"\u011c8\3\2\2\2\u011d\u011e\7=\2\2\u011e:\3\2\2\2\u011f\u0120\7?\2\2\u0120"+
		"<\3\2\2\2\u0121\u0122\7*\2\2\u0122>\3\2\2\2\u0123\u0124\7+\2\2\u0124@"+
		"\3\2\2\2\u0125\u0126\7}\2\2\u0126B\3\2\2\2\u0127\u0128\7\177\2\2\u0128"+
		"D\3\2\2\2\u0129\u012a\7]\2\2\u012aF\3\2\2\2\u012b\u012c\7_\2\2\u012cH"+
		"\3\2\2\2\u012d\u012e\7.\2\2\u012eJ\3\2\2\2\u012f\u0130\7<\2\2\u0130L\3"+
		"\2\2\2\u0131\u0132\7x\2\2\u0132\u0133\7g\2\2\u0133\u0134\7t\2\2\u0134"+
		"\u0135\7f\2\2\u0135\u0136\7c\2\2\u0136\u0137\7f\2\2\u0137\u0138\7g\2\2"+
		"\u0138\u0139\7t\2\2\u0139\u013a\7q\2\2\u013aN\3\2\2\2\u013b\u013c\7h\2"+
		"\2\u013c\u013d\7c\2\2\u013d\u013e\7n\2\2\u013e\u013f\7u\2\2\u013f\u0140"+
		"\7q\2\2\u0140P\3\2\2\2\u0141\u0142\7p\2\2\u0142\u0143\7w\2\2\u0143\u0144"+
		"\7n\2\2\u0144\u0145\7q\2\2\u0145R\3\2\2\2\u0146\u0147\7u\2\2\u0147\u0148"+
		"\7k\2\2\u0148T\3\2\2\2\u0149\u014a\7u\2\2\u014a\u014b\7k\2\2\u014b\u014c"+
		"\7a\2\2\u014c\u014d\7p\2\2\u014d\u014e\7q\2\2\u014eV\3\2\2\2\u014f\u0150"+
		"\7o\2\2\u0150\u0151\7k\2\2\u0151\u0152\7g\2\2\u0152\u0153\7p\2\2\u0153"+
		"\u0154\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7c\2\2\u0156\u0157\7u\2\2"+
		"\u0157X\3\2\2\2\u0158\u0159\7u\2\2\u0159\u015a\7g\2\2\u015a\u015b\7n\2"+
		"\2\u015b\u015c\7g\2\2\u015c\u015d\7e\2\2\u015d\u015e\7e\2\2\u015e\u015f"+
		"\7k\2\2\u015f\u0160\7q\2\2\u0160\u0161\7p\2\2\u0161\u0162\7c\2\2\u0162"+
		"\u0163\7t\2\2\u0163Z\3\2\2\2\u0164\u0165\7e\2\2\u0165\u0166\7c\2\2\u0166"+
		"\u0167\7u\2\2\u0167\u0168\7q\2\2\u0168\\\3\2\2\2\u0169\u016a\7t\2\2\u016a"+
		"\u016b\7q\2\2\u016b\u016c\7o\2\2\u016c\u016d\7r\2\2\u016d\u016e\7g\2\2"+
		"\u016e\u016f\7t\2\2\u016f^\3\2\2\2\u0170\u0171\7j\2\2\u0171\u0172\7c\2"+
		"\2\u0172\u0173\7e\2\2\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2\u0175`\3\2"+
		"\2\2\u0176\u0177\7r\2\2\u0177\u0178\7c\2\2\u0178\u0179\7t\2\2\u0179\u017a"+
		"\7c\2\2\u017ab\3\2\2\2\u017b\u017c\7f\2\2\u017c\u017d\7g\2\2\u017d\u017e"+
		"\7h\2\2\u017e\u017f\7g\2\2\u017f\u0180\7e\2\2\u0180\u0181\7v\2\2\u0181"+
		"\u0182\7q\2\2\u0182d\3\2\2\2\u0183\u0187\t\3\2\2\u0184\u0186\t\4\2\2\u0185"+
		"\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188f\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\t\5\2\2\u018b\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"h\3\2\2\2\u018f\u0190\7r\2\2\u0190\u0191\7w\2\2\u0191\u0192\7d\2\2\u0192"+
		"\u0193\7n\2\2\u0193\u0194\7k\2\2\u0194\u0195\7e\2\2\u0195\u0196\7q\2\2"+
		"\u0196j\3\2\2\2\u0197\u0198\7r\2\2\u0198\u0199\7t\2\2\u0199\u019a\7k\2"+
		"\2\u019a\u019b\7x\2\2\u019b\u019c\7c\2\2\u019c\u019d\7f\2\2\u019d\u019e"+
		"\7q\2\2\u019el\3\2\2\2\u019f\u01a0\7r\2\2\u01a0\u01a1\7t\2\2\u01a1\u01a2"+
		"\7q\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7i\2\2\u01a5"+
		"\u01a6\7k\2\2\u01a6\u01a7\7f\2\2\u01a7\u01a8\7q\2\2\u01a8n\3\2\2\2\u01a9"+
		"\u01aa\7g\2\2\u01aa\u01ab\7u\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7c\2\2"+
		"\u01ad\u01ae\7v\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1"+
		"\7q\2\2\u01b1p\3\2\2\2\u01b2\u01b3\7h\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5"+
		"\7p\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7n\2\2\u01b7r\3\2\2\2\u01b8\u01b9"+
		"\7c\2\2\u01b9\u01ba\7d\2\2\u01ba\u01bb\7u\2\2\u01bb\u01bc\7v\2\2\u01bc"+
		"\u01bd\7t\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7e\2\2\u01bf\u01c0\7v\2\2"+
		"\u01c0\u01c1\7q\2\2\u01c1t\3\2\2\2\u01c2\u01c4\t\5\2\2\u01c3\u01c2\3\2"+
		"\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\7\60\2\2\u01c9\u01cb\t"+
		"\5\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01d8\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\t\6"+
		"\2\2\u01d0\u01d2\t\7\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01d5\t\5\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01cf\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9v\3\2\2\2\u01da\u01dd\5g\64\2"+
		"\u01db\u01dd\5u;\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01e1\t\b\2\2\u01df\u01e2\5g\64\2\u01e0\u01e2\5u;\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01e4\7k\2\2\u01e4x\3\2\2\2\u01e5\u01eb\7$\2\2\u01e6\u01ea"+
		"\n\t\2\2\u01e7\u01e8\7$\2\2\u01e8\u01ea\7$\2\2\u01e9\u01e6\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7$\2\2\u01ef"+
		"z\3\2\2\2\u01f0\u01f1\t\n\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\b>\2\2\u01f3"+
		"|\3\2\2\2\u01f4\u01f5\13\2\2\2\u01f5~\3\2\2\2\u01f6\u01f7\7p\2\2\u01f7"+
		"\u01f8\7w\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7x\2\2\u01fa\u01fb\7q\2\2"+
		"\u01fb\u0080\3\2\2\2\u01fc\u0200\t\13\2\2\u01fd\u01ff\t\4\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0082\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0207\t\f\2\2\u0204\u0206\t\4"+
		"\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0084\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\60"+
		"\2\2\u020b\u0086\3\2\2\2\u020c\u020d\7g\2\2\u020d\u020e\7u\2\2\u020e\u020f"+
		"\7v\2\2\u020f\u0210\7q\2\2\u0210\u0088\3\2\2\2\u0211\u0212\7k\2\2\u0212"+
		"\u0213\7o\2\2\u0213\u0214\7r\2\2\u0214\u0215\7n\2\2\u0215\u0216\7g\2\2"+
		"\u0216\u0217\7o\2\2\u0217\u0218\7g\2\2\u0218\u0219\7p\2\2\u0219\u021a"+
		"\7v\2\2\u021a\u021b\7c\2\2\u021b\u008a\3\2\2\2\u021c\u021d\7g\2\2\u021d"+
		"\u021e\7z\2\2\u021e\u021f\7v\2\2\u021f\u0220\7k\2\2\u0220\u0221\7g\2\2"+
		"\u0221\u0222\7p\2\2\u0222\u0223\7f\2\2\u0223\u0224\7g\2\2\u0224\u008c"+
		"\3\2\2\2\u0225\u0226\7u\2\2\u0226\u0227\7w\2\2\u0227\u0228\7r\2\2\u0228"+
		"\u0229\7g\2\2\u0229\u022a\7t\2\2\u022a\u022b\7e\2\2\u022b\u022c\7n\2\2"+
		"\u022c\u022d\7c\2\2\u022d\u022e\7u\2\2\u022e\u022f\7g\2\2\u022f\u008e"+
		"\3\2\2\2\u0230\u0231\7k\2\2\u0231\u0232\7p\2\2\u0232\u0233\7v\2\2\u0233"+
		"\u0234\7g\2\2\u0234\u0235\7t\2\2\u0235\u0236\7h\2\2\u0236\u0237\7c\2\2"+
		"\u0237\u0238\7|\2\2\u0238\u0090\3\2\2\2\u0239\u023a\7e\2\2\u023a\u023b"+
		"\7n\2\2\u023b\u023c\7c\2\2\u023c\u023d\7u\2\2\u023d\u023e\7g\2\2\u023e"+
		"\u0092\3\2\2\2\23\2\u0097\u00a0\u00a5\u0187\u018d\u01c5\u01cc\u01d1\u01d6"+
		"\u01d8\u01dc\u01e1\u01e9\u01eb\u0200\u0207\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}