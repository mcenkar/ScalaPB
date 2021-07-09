// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

@SerialVersionUID(0L)
final case class FieldTransformation(
    when: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto] = _root_.scala.None,
    matchType: _root_.scala.Option[scalapb.options.MatchType] = _root_.scala.None,
    set: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[FieldTransformation] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = -1
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (when.isDefined) {
        val __value = when.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (matchType.isDefined) {
        val __value = matchType.get.value
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value)
      };
      if (set.isDefined) {
        val __value = set.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeCachedValue
      if (__size == -1) {
        __size = __computeSerializedValue()
        __serializedSizeCachedValue = __size
      }
      __size
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      when.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      matchType.foreach { __v =>
        val __m = __v.value
        _output__.writeEnum(2, __m)
      };
      set.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getWhen: com.google.protobuf.descriptor.FieldDescriptorProto = when.getOrElse(com.google.protobuf.descriptor.FieldDescriptorProto.defaultInstance)
    def clearWhen: FieldTransformation = copy(when = _root_.scala.None)
    def withWhen(__v: com.google.protobuf.descriptor.FieldDescriptorProto): FieldTransformation = copy(when = Option(__v))
    def getMatchType: scalapb.options.MatchType = matchType.getOrElse(scalapb.options.MatchType.CONTAINS)
    def clearMatchType: FieldTransformation = copy(matchType = _root_.scala.None)
    def withMatchType(__v: scalapb.options.MatchType): FieldTransformation = copy(matchType = Option(__v))
    def getSet: com.google.protobuf.descriptor.FieldOptions = set.getOrElse(com.google.protobuf.descriptor.FieldOptions.defaultInstance)
    def clearSet: FieldTransformation = copy(set = _root_.scala.None)
    def withSet(__v: com.google.protobuf.descriptor.FieldOptions): FieldTransformation = copy(set = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => when.orNull
        case 2 => matchType.map(_.javaValueDescriptor).orNull
        case 3 => set.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => when.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => matchType.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => set.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: scalapb.options.FieldTransformation.type = scalapb.options.FieldTransformation
    // @@protoc_insertion_point(GeneratedMessage[scalapb.FieldTransformation])
}

object FieldTransformation extends scalapb.GeneratedMessageCompanion[scalapb.options.FieldTransformation] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.FieldTransformation] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.FieldTransformation = {
    var __when: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto] = _root_.scala.None
    var __matchType: _root_.scala.Option[scalapb.options.MatchType] = _root_.scala.None
    var __set: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions] = _root_.scala.None
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __when = Option(__when.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.FieldDescriptorProto](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case 16 =>
          __matchType = Option(scalapb.options.MatchType.fromValue(_input__.readEnum()))
        case 26 =>
          __set = Option(__set.fold(_root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.FieldOptions](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    scalapb.options.FieldTransformation(
        when = __when,
        matchType = __matchType,
        set = __set,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.FieldTransformation] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.FieldTransformation(
        when = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto]]),
        matchType = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => scalapb.options.MatchType.fromValue(__e.number)),
        set = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.descriptor.FieldOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes().get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.descriptor.FieldDescriptorProto
      case 3 => __out = com.google.protobuf.descriptor.FieldOptions
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => scalapb.options.MatchType
    }
  }
  lazy val defaultInstance = scalapb.options.FieldTransformation(
    when = _root_.scala.None,
    matchType = _root_.scala.None,
    set = _root_.scala.None
  )
  implicit class FieldTransformationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.FieldTransformation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.FieldTransformation](_l) {
    def when: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto] = field(_.getWhen)((c_, f_) => c_.copy(when = Option(f_)))
    def optionalWhen: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto]] = field(_.when)((c_, f_) => c_.copy(when = f_))
    def matchType: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.MatchType] = field(_.getMatchType)((c_, f_) => c_.copy(matchType = Option(f_)))
    def optionalMatchType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[scalapb.options.MatchType]] = field(_.matchType)((c_, f_) => c_.copy(matchType = f_))
    def set: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions] = field(_.getSet)((c_, f_) => c_.copy(set = Option(f_)))
    def optionalSet: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions]] = field(_.set)((c_, f_) => c_.copy(set = f_))
  }
  final val WHEN_FIELD_NUMBER = 1
  final val MATCH_TYPE_FIELD_NUMBER = 2
  final val SET_FIELD_NUMBER = 3
  def of(
    when: _root_.scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto],
    matchType: _root_.scala.Option[scalapb.options.MatchType],
    set: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions]
  ): _root_.scalapb.options.FieldTransformation = _root_.scalapb.options.FieldTransformation(
    when,
    matchType,
    set
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.FieldTransformation])
}
