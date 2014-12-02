package hxDaedalus.factories;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class RectMesh extends haxe.lang.HxObject
{
	public    RectMesh(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    RectMesh()
	{
		hxDaedalus.factories.RectMesh.__hx_ctor_hxDaedalus_factories_RectMesh(this);
	}
	
	
	public static   void __hx_ctor_hxDaedalus_factories_RectMesh(hxDaedalus.factories.RectMesh __temp_me41)
	{
		{
		}
		
	}
	
	
	public static   hxDaedalus.data.Mesh buildRectangle(double width, double height)
	{
		hxDaedalus.data.Vertex _0 = new hxDaedalus.data.Vertex();
		hxDaedalus.data.Vertex vTL = _0;
		hxDaedalus.data.Vertex _1 = new hxDaedalus.data.Vertex();
		hxDaedalus.data.Vertex vTR = _1;
		hxDaedalus.data.Vertex _2 = new hxDaedalus.data.Vertex();
		hxDaedalus.data.Vertex vBR = _2;
		hxDaedalus.data.Vertex _3 = new hxDaedalus.data.Vertex();
		hxDaedalus.data.Vertex vBL = _3;
		hxDaedalus.data.Edge _4 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTL_TR = _4;
		hxDaedalus.data.Edge _5 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTR_TL = _5;
		hxDaedalus.data.Edge _6 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTR_BR = _6;
		hxDaedalus.data.Edge _7 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBR_TR = _7;
		hxDaedalus.data.Edge _8 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBR_BL = _8;
		hxDaedalus.data.Edge _9 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBL_BR = _9;
		hxDaedalus.data.Edge _10 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBL_TL = _10;
		hxDaedalus.data.Edge _11 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTL_BL = _11;
		hxDaedalus.data.Edge _12 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTR_BL = _12;
		hxDaedalus.data.Edge _13 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBL_TR = _13;
		hxDaedalus.data.Edge _14 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eTL_BR = _14;
		hxDaedalus.data.Edge _15 = new hxDaedalus.data.Edge();
		hxDaedalus.data.Edge eBR_TL = _15;
		hxDaedalus.data.Face _16 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTL_BL_TR = _16;
		hxDaedalus.data.Face _17 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTR_BL_BR = _17;
		hxDaedalus.data.Face _18 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTL_BR_BL = _18;
		hxDaedalus.data.Face _19 = new hxDaedalus.data.Face();
		hxDaedalus.data.Face fTL_TR_BR = _19;
		hxDaedalus.data.ConstraintShape _20 = new hxDaedalus.data.ConstraintShape();
		hxDaedalus.data.ConstraintShape boundShape = _20;
		hxDaedalus.data.ConstraintSegment _21 = new hxDaedalus.data.ConstraintSegment();
		hxDaedalus.data.ConstraintSegment segTop = _21;
		hxDaedalus.data.ConstraintSegment _22 = new hxDaedalus.data.ConstraintSegment();
		hxDaedalus.data.ConstraintSegment segRight = _22;
		hxDaedalus.data.ConstraintSegment _23 = new hxDaedalus.data.ConstraintSegment();
		hxDaedalus.data.ConstraintSegment segBot = _23;
		hxDaedalus.data.ConstraintSegment _24 = new hxDaedalus.data.ConstraintSegment();
		hxDaedalus.data.ConstraintSegment segLeft = _24;
		hxDaedalus.data.Mesh _25 = new hxDaedalus.data.Mesh(((double) (width) ), ((double) (height) ));
		hxDaedalus.data.Mesh mesh = _25;
		double _26 = ( 0.01 * 1000 );
		double offset = _26;
		double _27 = ( 0 - offset );
		double _28 = ( 0 - offset );
		vTL.get_pos().setXY(_27, _28);
		double _29 = ( width + offset );
		double _30 = ( 0 - offset );
		vTR.get_pos().setXY(_29, _30);
		double _31 = ( width + offset );
		double _32 = ( height + offset );
		vBR.get_pos().setXY(_31, _32);
		double _33 = ( 0 - offset );
		double _34 = ( height + offset );
		vBL.get_pos().setXY(_33, _34);
		vTL.setDatas(eTL_TR, null);
		vTR.setDatas(eTR_BR, null);
		vBR.setDatas(eBR_BL, null);
		vBL.setDatas(eBL_TL, null);
		eTL_TR.setDatas(vTL, eTR_TL, eTR_BR, fTL_TR_BR, true, true);
		eTR_TL.setDatas(vTR, eTL_TR, eTL_BL, fTL_BL_TR, true, true);
		eTR_BR.setDatas(vTR, eBR_TR, eBR_TL, fTL_TR_BR, true, true);
		eBR_TR.setDatas(vBR, eTR_BR, eTR_BL, fTR_BL_BR, true, true);
		eBR_BL.setDatas(vBR, eBL_BR, eBL_TL, fTL_BR_BL, true, true);
		eBL_BR.setDatas(vBL, eBR_BL, eBR_TR, fTR_BL_BR, true, true);
		eBL_TL.setDatas(vBL, eTL_BL, eTL_BR, fTL_BR_BL, true, true);
		eTL_BL.setDatas(vTL, eBL_TL, eBL_TR, fTL_BL_TR, true, true);
		eTR_BL.setDatas(vTR, eBL_TR, eBL_BR, fTR_BL_BR, true, false);
		eBL_TR.setDatas(vBL, eTR_BL, eTR_TL, fTL_BL_TR, true, false);
		eTL_BR.setDatas(vTL, eBR_TL, eBR_BL, fTL_BR_BL, false, false);
		eBR_TL.setDatas(vBR, eTL_BR, eTL_TR, fTL_TR_BR, false, false);
		fTL_BL_TR.setDatas(eBL_TR, null);
		fTR_BL_BR.setDatas(eTR_BL, null);
		fTL_BR_BL.setDatas(eBR_BL, false);
		fTL_TR_BR.setDatas(eTR_BR, false);
		haxe.root.Array<hxDaedalus.data.ConstraintSegment> _35 = new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segTop, segLeft});
		vTL.set_fromConstraintSegments(_35);
		haxe.root.Array<hxDaedalus.data.ConstraintSegment> _36 = new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segTop, segRight});
		vTR.set_fromConstraintSegments(_36);
		haxe.root.Array<hxDaedalus.data.ConstraintSegment> _37 = new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segRight, segBot});
		vBR.set_fromConstraintSegments(_37);
		haxe.root.Array<hxDaedalus.data.ConstraintSegment> _38 = new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segBot, segLeft});
		vBL.set_fromConstraintSegments(_38);
		eTL_TR.fromConstraintSegments.push(segTop);
		eTR_TL.fromConstraintSegments.push(segTop);
		eTR_BR.fromConstraintSegments.push(segRight);
		eBR_TR.fromConstraintSegments.push(segRight);
		eBR_BL.fromConstraintSegments.push(segBot);
		eBL_BR.fromConstraintSegments.push(segBot);
		eBL_TL.fromConstraintSegments.push(segLeft);
		eTL_BL.fromConstraintSegments.push(segLeft);
		segTop.get_edges().push(eTL_TR);
		segRight.get_edges().push(eTR_BR);
		segBot.get_edges().push(eBR_BL);
		segLeft.get_edges().push(eBL_TL);
		segTop.fromShape = boundShape;
		segRight.fromShape = boundShape;
		segBot.fromShape = boundShape;
		segLeft.fromShape = boundShape;
		{
			int _g = 0;
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _39 = new haxe.root.Array<hxDaedalus.data.ConstraintSegment>(new hxDaedalus.data.ConstraintSegment[]{segTop, segRight, segBot, segLeft});
			haxe.root.Array<hxDaedalus.data.ConstraintSegment> _g1 = _39;
			while (true)
			{
				int _40 = _g1.length;
				boolean _41 = ( _g < _40 );
				boolean _42 =  ! (_41) ;
				if (_42) 
				{
					break;
				}
				
				haxe.root.Array<hxDaedalus.data.ConstraintSegment> _43 = _g1;
				hxDaedalus.data.ConstraintSegment _44 = _43.__get(_g);
				hxDaedalus.data.ConstraintSegment f = _44;
				 ++ _g;
				boundShape.segments.push(f);
			}
			
		}
		
		{
			int _g2 = 0;
			haxe.root.Array<hxDaedalus.data.Vertex> _45 = new haxe.root.Array<hxDaedalus.data.Vertex>(new hxDaedalus.data.Vertex[]{vTL, vTR, vBR, vBL});
			haxe.root.Array<hxDaedalus.data.Vertex> _g11 = _45;
			while (true)
			{
				int _46 = _g11.length;
				boolean _47 = ( _g2 < _46 );
				boolean _48 =  ! (_47) ;
				if (_48) 
				{
					break;
				}
				
				haxe.root.Array<hxDaedalus.data.Vertex> _49 = _g11;
				hxDaedalus.data.Vertex _50 = _49.__get(_g2);
				hxDaedalus.data.Vertex f1 = _50;
				 ++ _g2;
				mesh._vertices.push(f1);
			}
			
		}
		
		{
			int _g3 = 0;
			haxe.root.Array<hxDaedalus.data.Edge> _51 = new haxe.root.Array<hxDaedalus.data.Edge>(new hxDaedalus.data.Edge[]{eTL_TR, eTR_TL, eTR_BR, eBR_TR, eBR_BL, eBL_BR, eBL_TL, eTL_BL, eTR_BL, eBL_TR, eTL_BR, eBR_TL});
			haxe.root.Array<hxDaedalus.data.Edge> _g12 = _51;
			while (true)
			{
				int _52 = _g12.length;
				boolean _53 = ( _g3 < _52 );
				boolean _54 =  ! (_53) ;
				if (_54) 
				{
					break;
				}
				
				haxe.root.Array<hxDaedalus.data.Edge> _55 = _g12;
				hxDaedalus.data.Edge _56 = _55.__get(_g3);
				hxDaedalus.data.Edge f2 = _56;
				 ++ _g3;
				mesh._edges.push(f2);
			}
			
		}
		
		{
			int _g4 = 0;
			haxe.root.Array<hxDaedalus.data.Face> _57 = new haxe.root.Array<hxDaedalus.data.Face>(new hxDaedalus.data.Face[]{fTL_BL_TR, fTR_BL_BR, fTL_BR_BL, fTL_TR_BR});
			haxe.root.Array<hxDaedalus.data.Face> _g13 = _57;
			while (true)
			{
				int _58 = _g13.length;
				boolean _59 = ( _g4 < _58 );
				boolean _60 =  ! (_59) ;
				if (_60) 
				{
					break;
				}
				
				haxe.root.Array<hxDaedalus.data.Face> _61 = _g13;
				hxDaedalus.data.Face _62 = _61.__get(_g4);
				hxDaedalus.data.Face f3 = _62;
				 ++ _g4;
				mesh._faces.push(f3);
			}
			
		}
		
		mesh.get___constraintShapes().push(boundShape);
		haxe.root.Array<java.lang.Object> _63 = new haxe.root.Array<java.lang.Object>();
		haxe.root.Array<java.lang.Object> securityRect = _63;
		{
			int _g5 = 0;
			haxe.root.Array<java.lang.Object> _64 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (0) ), ((java.lang.Object) (0) ), ((java.lang.Object) (width) ), ((java.lang.Object) (0) )});
			haxe.root.Array<java.lang.Object> _g14 = _64;
			while (true)
			{
				int _65 = _g14.length;
				boolean _66 = ( _g5 < _65 );
				boolean _67 =  ! (_66) ;
				if (_67) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _68 = _g14;
				double _69 = ((double) (haxe.lang.Runtime.toDouble(_68.__get(_g5))) );
				double f4 = _69;
				 ++ _g5;
				securityRect.push(f4);
			}
			
		}
		
		{
			int _g6 = 0;
			haxe.root.Array<java.lang.Object> _70 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (width) ), ((java.lang.Object) (0) ), ((java.lang.Object) (width) ), ((java.lang.Object) (height) )});
			haxe.root.Array<java.lang.Object> _g15 = _70;
			while (true)
			{
				int _71 = _g15.length;
				boolean _72 = ( _g6 < _71 );
				boolean _73 =  ! (_72) ;
				if (_73) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _74 = _g15;
				double _75 = ((double) (haxe.lang.Runtime.toDouble(_74.__get(_g6))) );
				double f5 = _75;
				 ++ _g6;
				securityRect.push(f5);
			}
			
		}
		
		{
			int _g7 = 0;
			haxe.root.Array<java.lang.Object> _76 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (width) ), ((java.lang.Object) (height) ), ((java.lang.Object) (0) ), ((java.lang.Object) (height) )});
			haxe.root.Array<java.lang.Object> _g16 = _76;
			while (true)
			{
				int _77 = _g16.length;
				boolean _78 = ( _g7 < _77 );
				boolean _79 =  ! (_78) ;
				if (_79) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _80 = _g16;
				double _81 = ((double) (haxe.lang.Runtime.toDouble(_80.__get(_g7))) );
				double f6 = _81;
				 ++ _g7;
				securityRect.push(f6);
			}
			
		}
		
		{
			int _g8 = 0;
			haxe.root.Array<java.lang.Object> _82 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (0) ), ((java.lang.Object) (height) ), ((java.lang.Object) (0) ), ((java.lang.Object) (0) )});
			haxe.root.Array<java.lang.Object> _g17 = _82;
			while (true)
			{
				int _83 = _g17.length;
				boolean _84 = ( _g8 < _83 );
				boolean _85 =  ! (_84) ;
				if (_85) 
				{
					break;
				}
				
				haxe.root.Array<java.lang.Object> _86 = _g17;
				double _87 = ((double) (haxe.lang.Runtime.toDouble(_86.__get(_g8))) );
				double f7 = _87;
				 ++ _g8;
				securityRect.push(f7);
			}
			
		}
		
		mesh.set_clipping(false);
		haxe.root.Array<java.lang.Object> _88 = securityRect;
		mesh.insertConstraintShape(_88);
		mesh.set_clipping(true);
		return mesh;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new hxDaedalus.factories.RectMesh(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new hxDaedalus.factories.RectMesh();
	}
	
	
}


