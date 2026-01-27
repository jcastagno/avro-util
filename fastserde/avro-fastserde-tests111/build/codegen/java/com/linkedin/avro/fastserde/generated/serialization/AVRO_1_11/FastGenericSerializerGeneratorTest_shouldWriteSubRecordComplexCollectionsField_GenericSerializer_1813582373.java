
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_11;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import com.linkedin.avro.fastserde.customized.DatumWriterCustomization;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField_GenericSerializer_1813582373
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField0(data, (encoder), (customization));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField0(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        List<Map<CharSequence, IndexedRecord>> recordsArrayMap0 = ((List<Map<CharSequence, IndexedRecord>> ) data.get(0));
        (encoder).writeArrayStart();
        if ((recordsArrayMap0 == null)||recordsArrayMap0 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsArrayMap0 .size());
            for (int counter0 = 0; (counter0 <recordsArrayMap0 .size()); counter0 ++) {
                (encoder).startItem();
                Map<CharSequence, IndexedRecord> map_of_union_NULL_subRecord0 = null;
                map_of_union_NULL_subRecord0 = ((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMap0).get(counter0);
                (customization).getCheckMapTypeFunction().apply(map_of_union_NULL_subRecord0);
                (encoder).writeMapStart();
                if ((map_of_union_NULL_subRecord0 == null)||map_of_union_NULL_subRecord0 .isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(map_of_union_NULL_subRecord0 .size());
                    for (CharSequence key0 : ((Map<CharSequence, IndexedRecord> ) map_of_union_NULL_subRecord0).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key0);
                        IndexedRecord union_NULL_subRecord0 = null;
                        union_NULL_subRecord0 = ((Map<CharSequence, IndexedRecord> ) map_of_union_NULL_subRecord0).get(key0);
                        if (union_NULL_subRecord0 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union_NULL_subRecord0 instanceof IndexedRecord)&&"com.linkedin.avro.fastserde.generated.avro.subRecord".equals(((IndexedRecord) union_NULL_subRecord0).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializeSubRecord0(((IndexedRecord) union_NULL_subRecord0), (encoder), (customization));
                            }
                        }
                    }
                }
                (encoder).writeMapEnd();
            }
        }
        (encoder).writeArrayEnd();
        serialize_FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField0(data, (encoder), (customization));
        serialize_FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField1(data, (encoder), (customization));
    }

    @SuppressWarnings("unchecked")
    public void serializeSubRecord0(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        CharSequence subField0 = ((CharSequence) data.get(0));
        if (subField0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            (encoder).writeIndex(1);
            if (((CharSequence) subField0) instanceof Utf8) {
                (encoder).writeString(((Utf8)((CharSequence) subField0)));
            } else {
                (encoder).writeString(((CharSequence) subField0).toString());
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void serialize_FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField0(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        Map<CharSequence, List<IndexedRecord>> recordsMapArray0 = ((Map<CharSequence, List<IndexedRecord>> ) data.get(1));
        (customization).getCheckMapTypeFunction().apply(recordsMapArray0);
        (encoder).writeMapStart();
        if ((recordsMapArray0 == null)||recordsMapArray0 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsMapArray0 .size());
            for (CharSequence key1 : ((Map<CharSequence, List<IndexedRecord>> ) recordsMapArray0).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key1);
                List<IndexedRecord> array_of_union_NULL_subRecord0 = null;
                array_of_union_NULL_subRecord0 = ((Map<CharSequence, List<IndexedRecord>> ) recordsMapArray0).get(key1);
                (encoder).writeArrayStart();
                if ((array_of_union_NULL_subRecord0 == null)||array_of_union_NULL_subRecord0 .isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(array_of_union_NULL_subRecord0 .size());
                    for (int counter1 = 0; (counter1 <array_of_union_NULL_subRecord0 .size()); counter1 ++) {
                        (encoder).startItem();
                        IndexedRecord union_NULL_subRecord1 = null;
                        union_NULL_subRecord1 = ((List<IndexedRecord> ) array_of_union_NULL_subRecord0).get(counter1);
                        if (union_NULL_subRecord1 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union_NULL_subRecord1 instanceof IndexedRecord)&&"com.linkedin.avro.fastserde.generated.avro.subRecord".equals(((IndexedRecord) union_NULL_subRecord1).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializeSubRecord0(((IndexedRecord) union_NULL_subRecord1), (encoder), (customization));
                            }
                        }
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        (encoder).writeMapEnd();
        List<Map<CharSequence, IndexedRecord>> recordsArrayMapUnion0 = ((List<Map<CharSequence, IndexedRecord>> ) data.get(2));
        if (recordsArrayMapUnion0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsArrayMapUnion0 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion0) == null)||((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion0).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion0).size());
                    for (int counter2 = 0; (counter2 <((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion0).size()); counter2 ++) {
                        (encoder).startItem();
                        Map<CharSequence, IndexedRecord> map_of_union_NULL_subRecord1 = null;
                        map_of_union_NULL_subRecord1 = ((List<Map<CharSequence, IndexedRecord>> )((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion0)).get(counter2);
                        (customization).getCheckMapTypeFunction().apply(map_of_union_NULL_subRecord1);
                        (encoder).writeMapStart();
                        if ((map_of_union_NULL_subRecord1 == null)||map_of_union_NULL_subRecord1 .isEmpty()) {
                            (encoder).setItemCount(0);
                        } else {
                            (encoder).setItemCount(map_of_union_NULL_subRecord1 .size());
                            for (CharSequence key2 : ((Map<CharSequence, IndexedRecord> ) map_of_union_NULL_subRecord1).keySet()) {
                                (encoder).startItem();
                                (encoder).writeString(key2);
                                IndexedRecord union_NULL_subRecord2 = null;
                                union_NULL_subRecord2 = ((Map<CharSequence, IndexedRecord> ) map_of_union_NULL_subRecord1).get(key2);
                                if (union_NULL_subRecord2 == null) {
                                    (encoder).writeIndex(0);
                                    (encoder).writeNull();
                                } else {
                                    if ((union_NULL_subRecord2 instanceof IndexedRecord)&&"com.linkedin.avro.fastserde.generated.avro.subRecord".equals(((IndexedRecord) union_NULL_subRecord2).getSchema().getFullName())) {
                                        (encoder).writeIndex(1);
                                        serializeSubRecord0(((IndexedRecord) union_NULL_subRecord2), (encoder), (customization));
                                    }
                                }
                            }
                        }
                        (encoder).writeMapEnd();
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void serialize_FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField1(IndexedRecord data, Encoder encoder, DatumWriterCustomization customization)
        throws IOException
    {
        Map<CharSequence, List<IndexedRecord>> recordsMapArrayUnion0 = ((Map<CharSequence, List<IndexedRecord>> ) data.get(3));
        if (recordsMapArrayUnion0 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsMapArrayUnion0 instanceof Map) {
                (encoder).writeIndex(1);
                (customization).getCheckMapTypeFunction().apply(((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion0));
                (encoder).writeMapStart();
                if ((((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion0) == null)||((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion0).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion0).size());
                    for (CharSequence key3 : ((Map<CharSequence, List<IndexedRecord>> )((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion0)).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key3);
                        List<IndexedRecord> array_of_union_NULL_subRecord1 = null;
                        array_of_union_NULL_subRecord1 = ((Map<CharSequence, List<IndexedRecord>> )((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion0)).get(key3);
                        (encoder).writeArrayStart();
                        if ((array_of_union_NULL_subRecord1 == null)||array_of_union_NULL_subRecord1 .isEmpty()) {
                            (encoder).setItemCount(0);
                        } else {
                            (encoder).setItemCount(array_of_union_NULL_subRecord1 .size());
                            for (int counter3 = 0; (counter3 <array_of_union_NULL_subRecord1 .size()); counter3 ++) {
                                (encoder).startItem();
                                IndexedRecord union_NULL_subRecord3 = null;
                                union_NULL_subRecord3 = ((List<IndexedRecord> ) array_of_union_NULL_subRecord1).get(counter3);
                                if (union_NULL_subRecord3 == null) {
                                    (encoder).writeIndex(0);
                                    (encoder).writeNull();
                                } else {
                                    if ((union_NULL_subRecord3 instanceof IndexedRecord)&&"com.linkedin.avro.fastserde.generated.avro.subRecord".equals(((IndexedRecord) union_NULL_subRecord3).getSchema().getFullName())) {
                                        (encoder).writeIndex(1);
                                        serializeSubRecord0(((IndexedRecord) union_NULL_subRecord3), (encoder), (customization));
                                    }
                                }
                            }
                        }
                        (encoder).writeArrayEnd();
                    }
                }
                (encoder).writeMapEnd();
            }
        }
    }

}
