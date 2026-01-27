
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_11;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.customized.DatumWriterCustomization;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class Array_of_union_NULL_STRING_GenericSerializer_317583799
    implements FastSerializer<List<CharSequence>>
{


    public void serialize(List<CharSequence> data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        (encoder).writeArrayStart();
        if ((data == null)||data.isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(data.size());
            for (int counter0 = 0; (counter0 <data.size()); counter0 ++) {
                (encoder).startItem();
                CharSequence union_NULL_STRING0 = null;
                union_NULL_STRING0 = ((List<CharSequence> ) data).get(counter0);
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
        (encoder).writeArrayEnd();
    }

}
