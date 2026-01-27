
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_11;

import java.io.IOException;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.customized.DatumWriterCustomization;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class Map_of_union_NULL_STRING_GenericSerializer_1486935134
    implements FastSerializer<Map<CharSequence, CharSequence>>
{


    public void serialize(Map<CharSequence, CharSequence> data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        (customization).getCheckMapTypeFunction().apply(data);
        (encoder).writeMapStart();
        if ((data == null)||data.isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(data.size());
            for (CharSequence key0 : ((Map<CharSequence, CharSequence> ) data).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key0);
                CharSequence union_NULL_STRING0 = null;
                union_NULL_STRING0 = ((Map<CharSequence, CharSequence> ) data).get(key0);
                if (union_NULL_STRING0 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    (encoder).writeIndex(1);
                    if (((CharSequence) union_NULL_STRING0) instanceof Utf8) {
                        (encoder).writeString(((Utf8)((CharSequence) union_NULL_STRING0)));
                    } else {
                        (encoder).writeString(((CharSequence) union_NULL_STRING0).toString());
                    }
                }
            }
        }
        (encoder).writeMapEnd();
    }

}
