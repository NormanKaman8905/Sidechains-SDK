package com.horizen.proposition;

import scala.util.Failure;
import scala.util.Success;
import scala.util.Try;
import scorex.util.serialization.Reader;
import scorex.util.serialization.Writer;

public final class PublicKey25519PropositionSerializer implements PropositionSerializer<PublicKey25519Proposition>
{
    private static PublicKey25519PropositionSerializer serializer;

    static {
        serializer = new PublicKey25519PropositionSerializer();
    }

    private PublicKey25519PropositionSerializer() {
        super();
    }

    public static PublicKey25519PropositionSerializer getSerializer() {
        return serializer;
    }

    @Override
    public byte[] toBytes(PublicKey25519Proposition proposition) {
        return proposition.bytes();
    }

    @Override
    public Try<PublicKey25519Proposition> parseBytesTry(byte[] bytes) {
        return PublicKey25519Proposition.parseBytes(bytes);
    }

    @Override
    public void serialize(PublicKey25519Proposition obj, Writer writer) {

    }

    @Override
    public PublicKey25519Proposition parse(Reader reader) {
        return null;
    }
}
