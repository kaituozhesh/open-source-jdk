package org.omg.CosNaming;


/**
* org/omg/CosNaming/NameComponentHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u201/12322/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Saturday, December 15, 2018 6:38:37 PM PST
*/

abstract public class NameComponentHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NameComponent:1.0";

  public static void insert (org.omg.CORBA.Any a, NameComponent that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NameComponent extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IstringHelper.id (), "Istring", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IstringHelper.id (), "Istring", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "kind",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (NameComponentHelper.id (), "NameComponent", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NameComponent read (org.omg.CORBA.portable.InputStream istream)
  {
    NameComponent value = new NameComponent ();
    value.id = istream.read_string ();
    value.kind = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NameComponent value)
  {
    ostream.write_string (value.id);
    ostream.write_string (value.kind);
  }

}
