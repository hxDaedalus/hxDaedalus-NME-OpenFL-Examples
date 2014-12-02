package haxe.lang;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FieldLookup extends haxe.lang.HxObject
{
	public    FieldLookup(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    FieldLookup()
	{
		haxe.lang.FieldLookup.__hx_ctor_haxe_lang_FieldLookup(this);
	}
	
	
	public static   void __hx_ctor_haxe_lang_FieldLookup(haxe.lang.FieldLookup __temp_me50)
	{
		{
		}
		
	}
	
	
	public static   int hash(java.lang.String s)
	{
		
		return s.hashCode();
	
	}
	
	
	public static   int findHash(java.lang.String hash, haxe.root.Array<java.lang.String> hashs)
	{
		int min = 0;
		int _0 = hashs.length;
		int max = _0;
		while (true)
		{
			boolean _1 = ( min < max );
			boolean _2 =  ! (_1) ;
			if (_2) 
			{
				break;
			}
			
			int _3 = ( max + min );
			int _4 = ( _3 / 2 );
			int mid = _4;
			haxe.root.Array<java.lang.String> _5 = hashs;
			java.lang.String _6 = _5.__get(mid);
			int _7 = hash.compareTo(_6);
			int classify = _7;
			boolean _8 = ( classify < 0 );
			if (_8) 
			{
				max = mid;
			}
			 else 
			{
				boolean _9 = ( classify > 0 );
				if (_9) 
				{
					int _10 = ( mid + 1 );
					min = _10;
				}
				 else 
				{
					return mid;
				}
				
			}
			
		}
		
		int _11 =  ~ (min) ;
		return _11;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.lang.FieldLookup(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.lang.FieldLookup();
	}
	
	
}


