
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_11;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.customized.DatumWriterCustomization;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class TestRecord_GenericSerializer_331683882
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        serializeTestRecord0(data, (encoder), (customization));
    }

    @SuppressWarnings("unchecked")
    public void serializeTestRecord0(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        List<CharSequence> fields0 = ((List<CharSequence> ) data.get(0));
        (encoder).writeArrayStart();
        if ((fields0 == null)||fields0 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(fields0 .size());
            for (int counter0 = 0; (counter0 <fields0 .size()); counter0 ++) {
                (encoder).startItem();
                CharSequence union_NULL_STRING0 = null;
                union_NULL_STRING0 = ((List<CharSequence> ) fields0).get(counter0);
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
