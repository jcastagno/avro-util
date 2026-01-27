
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_11;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.customized.DatumWriterCustomization;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class Array_of_union_INT_STRING_DOUBLE_GenericSerializer_895888951
    implements FastSerializer<List<Object>>
{


    public void serialize(List<Object> data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        (encoder).writeArrayStart();
        if ((data == null)||data.isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(data.size());
            for (int counter0 = 0; (counter0 <data.size()); counter0 ++) {
                (encoder).startItem();
                Object union_INT_STRING_DOUBLE0 = null;
                union_INT_STRING_DOUBLE0 = ((List<Object> ) data).get(counter0);
                if (union_INT_STRING_DOUBLE0 instanceof Integer) {
                    (encoder).writeIndex(0);
                    (encoder).writeInt(((Integer) union_INT_STRING_DOUBLE0));
                } else {
                    if (union_INT_STRING_DOUBLE0 instanceof CharSequence) {
                        (encoder).writeIndex(1);
                        if (((CharSequence) union_INT_STRING_DOUBLE0) instanceof Utf8) {
                            (encoder).writeString(((Utf8)((CharSequence) union_INT_STRING_DOUBLE0)));
                        } else {
                            (encoder).writeString(((CharSequence) union_INT_STRING_DOUBLE0).toString());
                        }
                    } else {
                        if (union_INT_STRING_DOUBLE0 instanceof Double) {
                            (encoder).writeIndex(2);
                            (encoder).writeDouble(((Double) union_INT_STRING_DOUBLE0));
                        }
                    }
                }
            }
        }
        (encoder).writeArrayEnd();
    }

}
