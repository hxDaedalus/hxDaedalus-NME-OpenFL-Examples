package hxDaedalus.swing;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class SwingHeader extends haxe.lang.HxObject
{
	static 
	{
		hxDaedalus.swing.SwingHeader.__meta__ = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"fields"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"parseInt", "toHashColor"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"static"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{null}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})), new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"static"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{null}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}))}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}))}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}));
	}
	public    SwingHeader(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    SwingHeader()
	{
		hxDaedalus.swing.SwingHeader.__hx_ctor_hxDaedalus_swing_SwingHeader(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_swing_SwingHeader(hxDaedalus.swing.SwingHeader __temp_me47)
	{
		haxe.root.Array<java.lang.String> _0 = haxe.lang.StringExt.split("600:400:60:FFFFFF", ":");
		haxe.root.Array<java.lang.String> swingHeader = _0;
		haxe.root.Array<java.lang.String> _1 = swingHeader;
		java.lang.String _2 = _1.__get(0);
		java.lang.Object _3 = haxe.root.Std.parseInt(_2);
		__temp_me47.width = ((int) (haxe.lang.Runtime.toInt(_3)) );
		haxe.root.Array<java.lang.String> _4 = swingHeader;
		java.lang.String _5 = _4.__get(1);
		java.lang.Object _6 = haxe.root.Std.parseInt(_5);
		__temp_me47.height = ((int) (haxe.lang.Runtime.toInt(_6)) );
		haxe.root.Array<java.lang.String> _7 = swingHeader;
		java.lang.String _8 = _7.__get(2);
		java.lang.Object _9 = haxe.root.Std.parseInt(_8);
		__temp_me47.frameRate = ((int) (haxe.lang.Runtime.toInt(_9)) );
		haxe.root.Array<java.lang.String> _10 = swingHeader;
		java.lang.String _11 = _10.__get(3);
		java.lang.Object _12 = haxe.root.Std.parseInt(_11);
		__temp_me47.bgColor = ((int) (haxe.lang.Runtime.toInt(_12)) );
	}
	
	
	public static  java.lang.Object __meta__;
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.swing.SwingHeader(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.swing.SwingHeader();
	}
	
	
	public  int width;
	
	public  int height;
	
	public  int frameRate;
	
	public  int bgColor;
	
	public final   int parseInt(java.lang.String e)
	{
		java.lang.Object _0 = haxe.root.Std.parseInt(e);
		return ((int) (haxe.lang.Runtime.toInt(_0)) );
	}
	
	
	public final   java.lang.String toHashColor(java.lang.String e)
	{
		java.lang.String _0 = ( "#" + e );
		return _0;
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef176 = true;
			switch (field.hashCode())
			{
				case -204859874:
				{
					if (field.equals("bgColor")) 
					{
						__temp_executeDef176 = false;
						this.bgColor = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 113126854:
				{
					if (field.equals("width")) 
					{
						__temp_executeDef176 = false;
						this.width = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 545057773:
				{
					if (field.equals("frameRate")) 
					{
						__temp_executeDef176 = false;
						this.frameRate = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1221029593:
				{
					if (field.equals("height")) 
					{
						__temp_executeDef176 = false;
						this.height = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef176) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef177 = true;
			switch (field.hashCode())
			{
				case -204859874:
				{
					if (field.equals("bgColor")) 
					{
						__temp_executeDef177 = false;
						this.bgColor = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 113126854:
				{
					if (field.equals("width")) 
					{
						__temp_executeDef177 = false;
						this.width = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 545057773:
				{
					if (field.equals("frameRate")) 
					{
						__temp_executeDef177 = false;
						this.frameRate = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case -1221029593:
				{
					if (field.equals("height")) 
					{
						__temp_executeDef177 = false;
						this.height = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef177) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef178 = true;
			switch (field.hashCode())
			{
				case -338484550:
				{
					if (field.equals("toHashColor")) 
					{
						__temp_executeDef178 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("toHashColor"))) );
					}
					
					break;
				}
				
				
				case 113126854:
				{
					if (field.equals("width")) 
					{
						__temp_executeDef178 = false;
						return this.width;
					}
					
					break;
				}
				
				
				case 1187783740:
				{
					if (field.equals("parseInt")) 
					{
						__temp_executeDef178 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("parseInt"))) );
					}
					
					break;
				}
				
				
				case -1221029593:
				{
					if (field.equals("height")) 
					{
						__temp_executeDef178 = false;
						return this.height;
					}
					
					break;
				}
				
				
				case -204859874:
				{
					if (field.equals("bgColor")) 
					{
						__temp_executeDef178 = false;
						return this.bgColor;
					}
					
					break;
				}
				
				
				case 545057773:
				{
					if (field.equals("frameRate")) 
					{
						__temp_executeDef178 = false;
						return this.frameRate;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef178) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef179 = true;
			switch (field.hashCode())
			{
				case -204859874:
				{
					if (field.equals("bgColor")) 
					{
						__temp_executeDef179 = false;
						return ((double) (this.bgColor) );
					}
					
					break;
				}
				
				
				case 113126854:
				{
					if (field.equals("width")) 
					{
						__temp_executeDef179 = false;
						return ((double) (this.width) );
					}
					
					break;
				}
				
				
				case 545057773:
				{
					if (field.equals("frameRate")) 
					{
						__temp_executeDef179 = false;
						return ((double) (this.frameRate) );
					}
					
					break;
				}
				
				
				case -1221029593:
				{
					if (field.equals("height")) 
					{
						__temp_executeDef179 = false;
						return ((double) (this.height) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef179) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef180 = true;
			switch (field.hashCode())
			{
				case -338484550:
				{
					if (field.equals("toHashColor")) 
					{
						__temp_executeDef180 = false;
						return this.toHashColor(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 1187783740:
				{
					if (field.equals("parseInt")) 
					{
						__temp_executeDef180 = false;
						return this.parseInt(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef180) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("bgColor");
		baseArr.push("frameRate");
		baseArr.push("height");
		baseArr.push("width");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


