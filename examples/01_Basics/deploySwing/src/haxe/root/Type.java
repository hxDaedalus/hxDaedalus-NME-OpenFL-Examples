package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Type extends haxe.lang.HxObject
{
	public    Type(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Type()
	{
		haxe.root.Type.__hx_ctor__Type(this);
	}
	
	
	public static   void __hx_ctor__Type(haxe.root.Type __temp_me5)
	{
		{
		}
		
	}
	
	
	public static  <T> java.lang.Class getClass(T o)
	{
		
		if (o == null || o instanceof haxe.lang.DynamicObject || o instanceof java.lang.Class)
			return null;

		return (java.lang.Class<T>) o.getClass();
	
	}
	
	
	public static   java.lang.Class getEnum(java.lang.Object o)
	{
		
		if (o instanceof java.lang.Enum || o instanceof haxe.lang.Enum)
			return o.getClass();
		return null;
	
	}
	
	
	public static   java.lang.Class getSuperClass(java.lang.Class c)
	{
		
		java.lang.Class cl = (c == null) ? null : c.getSuperclass();
		if (cl != null && !cl.getName().equals("haxe.lang.HxObject") && !cl.getName().equals("java.lang.Object") )
			return cl;
		return null;
	
	}
	
	
	public static   java.lang.String getClassName(java.lang.Class c)
	{
		java.lang.Class c1 = c;
		java.lang.String _0 = c1.getName();
		java.lang.String name = _0;
		boolean _1 = name.startsWith("haxe.root.");
		if (_1) 
		{
			java.lang.String _2 = haxe.lang.StringExt.substr(name, 10, null);
			return _2;
		}
		
		boolean _3 = name.startsWith("java.lang");
		if (_3) 
		{
			java.lang.String _4 = haxe.lang.StringExt.substr(name, 10, null);
			name = _4;
		}
		
		java.lang.String _5 = null;
		{
			java.lang.String __temp_svar83 = (name);
			int __temp_hash85 = __temp_svar83.hashCode();
			boolean __temp_executeDef84 = true;
			switch (__temp_hash85)
			{
				case -672261858:case 104431:
				{
					if (( (( ( __temp_hash85 == -672261858 ) && __temp_svar83.equals("Integer") )) || __temp_svar83.equals("int") )) 
					{
						__temp_executeDef84 = false;
						_5 = "Int";
					}
					
					break;
				}
				
				
				case -1939501217:
				{
					if (__temp_svar83.equals("Object")) 
					{
						__temp_executeDef84 = false;
						_5 = "Dynamic";
					}
					
					break;
				}
				
				
				case 2052876273:case -1325958191:
				{
					if (( (( ( __temp_hash85 == 2052876273 ) && __temp_svar83.equals("Double") )) || __temp_svar83.equals("double") )) 
					{
						__temp_executeDef84 = false;
						_5 = "Float";
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef84) 
			{
				_5 = name;
			}
			
		}
		
		return _5;
	}
	
	
	public static   java.lang.String getEnumName(java.lang.Class e)
	{
		java.lang.Class c = e;
		java.lang.String _0 = c.getName();
		java.lang.String ret = _0;
		boolean _1 = ret.startsWith("haxe.root.");
		if (_1) 
		{
			java.lang.String _2 = haxe.lang.StringExt.substr(ret, 10, null);
			return _2;
		}
		 else 
		{
			boolean _3 = haxe.lang.Runtime.valEq(ret, "boolean");
			boolean _4 =  ! (_3) ;
			boolean _5 = false;
			if (_4) 
			{
				_5 = haxe.lang.Runtime.valEq(ret, "java.lang.Boolean");
			}
			 else 
			{
				_5 = true;
			}
			
			if (_5) 
			{
				return "Bool";
			}
			
		}
		
		return ret;
	}
	
	
	public static   java.lang.Class resolveClass(java.lang.String name)
	{
		
		try {
			if (name.indexOf(".") == -1)
				name = "haxe.root." + name;
			return java.lang.Class.forName(name);
		}
		catch (java.lang.ClassNotFoundException e)
		{
			if (name.equals("haxe.root.Int")) return int.class;
			else if (name.equals("haxe.root.Float")) return double.class;
			else if (name.equals("haxe.root.String")) return java.lang.String.class;
			else if (name.equals("haxe.root.Math")) return java.lang.Math.class;
			else if (name.equals("haxe.root.Class")) return java.lang.Class.class;
			else if (name.equals("haxe.root.Dynamic")) return java.lang.Object.class;
			return null;
		}
	
	}
	
	
	public static   java.lang.Class resolveEnum(java.lang.String name)
	{
		
		if ("Bool".equals(name)) return boolean.class;
		Class r = resolveClass(name);
		if (r != null && (r.getSuperclass() == java.lang.Enum.class || r.getSuperclass() == haxe.lang.Enum.class))
			return r;
		return null;
	
	}
	
	
	public static  <T> T createInstance(java.lang.Class cl, haxe.root.Array args)
	{
		
			int len = args.length;
			java.lang.Class[] cls = new java.lang.Class[len];
			java.lang.Object[] objs = new java.lang.Object[len];

			java.lang.reflect.Constructor[] ms = cl.getConstructors();
			int msl = ms.length;
			int realMsl = 0;
			for(int i =0; i < msl; i++)
			{
				if (!ms[i].isVarArgs() && ms[i].getParameterTypes().length != len)
				{
					ms[i] = null;
				} else {
					ms[realMsl] = ms[i];
					if (realMsl != i)
						ms[i] = null;
					realMsl++;
				}
			}

			boolean hasNumber = false;

			for (int i = 0; i < len; i++)
			{
				Object o = args.__get(i);
				objs[i]= o;
				cls[i] = o.getClass();
				boolean isNum = false;

				if (o instanceof java.lang.Number)
				{
					cls[i] = java.lang.Number.class;
					isNum = hasNumber = true;
				}

				msl = realMsl;
				realMsl = 0;

				for (int j = 0; j < msl; j++)
				{
					java.lang.Class[] allcls = ms[j].getParameterTypes();
					if (i < allcls.length)
					{
						if (! ((isNum && allcls[i].isPrimitive()) || allcls[i].isAssignableFrom(cls[i])) )
						{
							ms[j] = null;
						} else {
							ms[realMsl] = ms[j];
							if (realMsl != j)
								ms[j] = null;
							realMsl++;
						}
					}
				}

			}

			java.lang.reflect.Constructor found = ms[0];

			if (hasNumber)
			{
				java.lang.Class[] allcls = found.getParameterTypes();

				for (int i = 0; i < len; i++)
				{
					java.lang.Object o = objs[i];
					if (o instanceof java.lang.Number)
					{
						java.lang.Class curCls = null;
						if (i < allcls.length)
						{
							curCls = allcls[i];
							if (!curCls.isAssignableFrom(o.getClass()))
							{
								String name = curCls.getName();
								if (name.equals("double") || name.equals("java.lang.Double"))
								{
									objs[i] = ((java.lang.Number)o).doubleValue();
								} else if (name.equals("int") || name.equals("java.lang.Integer"))
								{
									objs[i] = ((java.lang.Number)o).intValue();
								} else if (name.equals("float") || name.equals("java.lang.Float"))
								{
									objs[i] = ((java.lang.Number)o).floatValue();
								} else if (name.equals("byte") || name.equals("java.lang.Byte"))
								{
									objs[i] = ((java.lang.Number)o).byteValue();
								} else if (name.equals("short") || name.equals("java.lang.Short"))
								{
									objs[i] = ((java.lang.Number)o).shortValue();
								}
							}
						} //else varargs not handled TODO
					}
				}
			}

		try {
			found.setAccessible(true);
			return (T) found.newInstance(objs);
		}
		catch (java.lang.reflect.InvocationTargetException e)
		{
			throw haxe.lang.HaxeException.wrap(e.getCause());
		}

		catch (Throwable t)
		{
			throw haxe.lang.HaxeException.wrap(t);
		}
	
	}
	
	
	public static  <T> T createEmptyInstance(java.lang.Class cl)
	{
		boolean _0 = haxe.root.Reflect.hasField(cl, "__hx_createEmpty");
		if (_0) 
		{
			T _1 = ((T) (haxe.lang.Runtime.callField(cl, "__hx_createEmpty", null)) );
			return _1;
		}
		
		haxe.root.Array _2 = new haxe.root.Array(new java.lang.Object[]{});
		T _3 = ((T) (haxe.root.Type.createInstance(cl, _2)) );
		return _3;
	}
	
	
	public static  <T> T createEnum(java.lang.Class e, java.lang.String constr, haxe.root.Array params)
	{
		
		if (params == null || params.length == 0)
		{
			java.lang.Object ret = haxe.lang.Runtime.slowGetField(e, constr, true);
			if (ret instanceof haxe.lang.Function)
				throw haxe.lang.HaxeException.wrap("Constructor " + constr + " needs parameters");
			return (T) ret;
		} else {
			return (T) haxe.lang.Runtime.slowCallField(e, constr, params);
		}
	
	}
	
	
	public static  <T> T createEnumIndex(java.lang.Class e, int index, haxe.root.Array params)
	{
		haxe.root.Array<java.lang.String> _0 = haxe.root.Type.getEnumConstructs(e);
		haxe.root.Array<java.lang.String> constr = _0;
		haxe.root.Array<java.lang.String> _1 = constr;
		java.lang.String _2 = _1.__get(index);
		haxe.root.Array _3 = params;
		T _4 = ((T) (haxe.root.Type.createEnum(e, _2, _3)) );
		return _4;
	}
	
	
	public static   haxe.root.Array<java.lang.String> getInstanceFields(java.lang.Class c)
	{
		
		if (c == java.lang.String.class)
		{
			return haxe.lang.StringRefl.fields;
		}

		Array<String> ret = new Array<String>();
		for (java.lang.reflect.Field f : c.getFields())
		{
			java.lang.String fname = f.getName();
			if (!java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
				ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (!java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static   haxe.root.Array<java.lang.String> getClassFields(java.lang.Class c)
	{
		
		Array<String> ret = new Array<String>();
		if (c == java.lang.String.class)
		{
			ret.push("fromCharCode");
			return ret;
		}

		for (java.lang.reflect.Field f : c.getDeclaredFields())
		{
			java.lang.String fname = f.getName();
			if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
			ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getDeclaredMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static   haxe.root.Array<java.lang.String> getEnumConstructs(java.lang.Class e)
	{
		boolean _0 = haxe.root.Reflect.hasField(e, "constructs");
		if (_0) 
		{
			haxe.root.Array<java.lang.String> _1 = ((haxe.root.Array<java.lang.String>) (haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(e, "constructs", true), "copy", null)) );
			return _1;
		}
		
		java.lang.Enum[] _2 = ((java.lang.Enum[]) (haxe.lang.Runtime.callField(e, "values", null)) );
		java.lang.Enum[] vals = _2;
		haxe.root.Array<java.lang.String> _3 = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		haxe.root.Array<java.lang.String> ret = _3;
		{
			int _g1 = 0;
			int _4 = vals.length;
			int _g = _4;
			while (true)
			{
				boolean _5 = ( _g1 < _g );
				boolean _6 =  ! (_5) ;
				if (_6) 
				{
					break;
				}
				
				int _7 = _g1++;
				int i = _7;
				haxe.root.Array<java.lang.String> _8 = ret;
				_8.__set(i, vals[i].name());
			}
			
		}
		
		haxe.root.Array<java.lang.String> _9 = ret;
		return _9;
	}
	
	
	public static   haxe.root.ValueType typeof(java.lang.Object v)
	{
		
		if (v == null) return ValueType.TNull;

		if (v instanceof haxe.lang.IHxObject) {
			haxe.lang.IHxObject vobj = (haxe.lang.IHxObject) v;
			java.lang.Class cl = vobj.getClass();
			if (v instanceof haxe.lang.DynamicObject)
				return ValueType.TObject;
			else
				return ValueType.TClass(cl);
		} else if (v instanceof java.lang.Number) {
			java.lang.Number n = (java.lang.Number) v;
			if (n.intValue() == n.doubleValue())
				return ValueType.TInt;
			else
				return ValueType.TFloat;
		} else if (v instanceof haxe.lang.Function) {
			return ValueType.TFunction;
		} else if (v instanceof java.lang.Enum || v instanceof haxe.lang.Enum) {
			return ValueType.TEnum(v.getClass());
		} else if (v instanceof java.lang.Boolean) {
			return ValueType.TBool;
		} else if (v instanceof java.lang.Class) {
			return ValueType.TObject;
		} else {
			return ValueType.TClass(v.getClass());
		}
	
	}
	
	
	public static  <T> boolean enumEq(T a, T b)
	{
		
			if (a instanceof haxe.lang.Enum)
				return a.equals(b);
			else
				return haxe.lang.Runtime.eq(a, b);
	
	}
	
	
	public static   java.lang.String enumConstructor(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).name();
		else
			return ((haxe.lang.Enum) e).getTag();
	
	}
	
	
	public static   haxe.root.Array enumParameters(java.lang.Object e)
	{
		
		return ( e instanceof java.lang.Enum ) ? new haxe.root.Array() : ((haxe.lang.Enum) e).params;
	
	}
	
	
	public static   int enumIndex(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).ordinal();
		else
			return ((haxe.lang.Enum) e).index;
	
	}
	
	
	public static  <T> haxe.root.Array<T> allEnums(java.lang.Class e)
	{
		haxe.root.Array<java.lang.String> _0 = haxe.root.Type.getEnumConstructs(e);
		haxe.root.Array<java.lang.String> ctors = _0;
		haxe.root.Array<T> _1 = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		haxe.root.Array<T> ret = _1;
		{
			int _g = 0;
			while (true)
			{
				int _2 = ctors.length;
				boolean _3 = ( _g < _2 );
				boolean _4 =  ! (_3) ;
				if (_4) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.String> _5 = ctors;
				java.lang.String _6 = _5.__get(_g);
				java.lang.String ctor = _6;
				 ++ _g;
				java.lang.Object _7 = haxe.root.Reflect.field(e, ctor);
				T v = ((T) (_7) );
				boolean _8 = haxe.root.Std.is(v, e);
				if (_8) 
				{
					ret.push(v);
				}
				
			}
			
		}
		
		haxe.root.Array<T> _9 = ret;
		return _9;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Type(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Type();
	}
	
	
}


