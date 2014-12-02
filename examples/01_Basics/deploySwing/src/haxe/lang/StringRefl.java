package haxe.lang;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringRefl
{
	static 
	{
		haxe.lang.StringRefl.fields = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"length", "toUpperCase", "toLowerCase", "charAt", "charCodeAt", "indexOf", "lastIndexOf", "split", "substr", "substring"});
	}
	public    StringRefl()
	{
		{
		}
		
	}
	
	
	public static  haxe.root.Array<java.lang.String> fields;
	
	public static   java.lang.Object handleGetField(java.lang.String str, java.lang.String f, boolean throwErrors)
	{
		{
			java.lang.String __temp_svar195 = (f);
			int __temp_hash197 = __temp_svar195.hashCode();
			boolean __temp_executeDef196 = true;
			switch (__temp_hash197)
			{
				case -1106363674:
				{
					if (__temp_svar195.equals("length")) 
					{
						__temp_executeDef196 = false;
						int _0 = str.length();
						return _0;
					}
					
					break;
				}
				
				
				case 530542161:case -891529231:case 109648666:case -467511597:case 1943291465:case 397153782:case -1361633751:case -1137582698:case -399551817:
				{
					if (( (( ( __temp_hash197 == 530542161 ) && __temp_svar195.equals("substring") )) || ( (( ( __temp_hash197 == -891529231 ) && __temp_svar195.equals("substr") )) || ( (( ( __temp_hash197 == 109648666 ) && __temp_svar195.equals("split") )) || ( (( ( __temp_hash197 == -467511597 ) && __temp_svar195.equals("lastIndexOf") )) || ( (( ( __temp_hash197 == 1943291465 ) && __temp_svar195.equals("indexOf") )) || ( (( ( __temp_hash197 == 397153782 ) && __temp_svar195.equals("charCodeAt") )) || ( (( ( __temp_hash197 == -1361633751 ) && __temp_svar195.equals("charAt") )) || ( (( ( __temp_hash197 == -1137582698 ) && __temp_svar195.equals("toLowerCase") )) || __temp_svar195.equals("toUpperCase") ) ) ) ) ) ) ) )) 
					{
						__temp_executeDef196 = false;
						haxe.lang.Closure _1 = new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
						return _1;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef196) 
			{
				if (throwErrors) 
				{
					java.lang.String _2 = ( "Field not found: \'" + f );
					throw haxe.lang.HaxeException.wrap(( _2 + "\' in String" ));
				}
				 else 
				{
					return null;
				}
				
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	public static   java.lang.Object handleCallField(java.lang.String str, java.lang.String f, haxe.root.Array args)
	{
		haxe.root.Array _0 = new haxe.root.Array(new java.lang.Object[]{str});
		haxe.root.Array _args = _0;
		haxe.root.Array _1 = args;
		haxe.root.Array _2 = null;
		boolean _3 = ( _1 == _2 );
		if (_3) 
		{
			haxe.root.Array _4 = _args;
			args = _4;
		}
		 else 
		{
			haxe.root.Array _5 = args;
			haxe.root.Array _6 = _args.concat(_5);
			args = _6;
		}
		
		haxe.root.Array _7 = args;
		java.lang.Object _8 = haxe.lang.Runtime.slowCallField(haxe.lang.StringExt.class, f, _7);
		return _8;
	}
	
	
}


