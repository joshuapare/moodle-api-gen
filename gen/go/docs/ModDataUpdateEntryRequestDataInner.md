# ModDataUpdateEntryRequestDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fieldid** | Pointer to **int32** | The field id. | [optional] 
**Subfield** | Pointer to **string** | The subfield name (if required). | [optional] [default to "null"]
**Value** | Pointer to **string** | The new contents for the field always JSON encoded. | [optional] [default to "null"]

## Methods

### NewModDataUpdateEntryRequestDataInner

`func NewModDataUpdateEntryRequestDataInner() *ModDataUpdateEntryRequestDataInner`

NewModDataUpdateEntryRequestDataInner instantiates a new ModDataUpdateEntryRequestDataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataUpdateEntryRequestDataInnerWithDefaults

`func NewModDataUpdateEntryRequestDataInnerWithDefaults() *ModDataUpdateEntryRequestDataInner`

NewModDataUpdateEntryRequestDataInnerWithDefaults instantiates a new ModDataUpdateEntryRequestDataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFieldid

`func (o *ModDataUpdateEntryRequestDataInner) GetFieldid() int32`

GetFieldid returns the Fieldid field if non-nil, zero value otherwise.

### GetFieldidOk

`func (o *ModDataUpdateEntryRequestDataInner) GetFieldidOk() (*int32, bool)`

GetFieldidOk returns a tuple with the Fieldid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFieldid

`func (o *ModDataUpdateEntryRequestDataInner) SetFieldid(v int32)`

SetFieldid sets Fieldid field to given value.

### HasFieldid

`func (o *ModDataUpdateEntryRequestDataInner) HasFieldid() bool`

HasFieldid returns a boolean if a field has been set.

### GetSubfield

`func (o *ModDataUpdateEntryRequestDataInner) GetSubfield() string`

GetSubfield returns the Subfield field if non-nil, zero value otherwise.

### GetSubfieldOk

`func (o *ModDataUpdateEntryRequestDataInner) GetSubfieldOk() (*string, bool)`

GetSubfieldOk returns a tuple with the Subfield field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubfield

`func (o *ModDataUpdateEntryRequestDataInner) SetSubfield(v string)`

SetSubfield sets Subfield field to given value.

### HasSubfield

`func (o *ModDataUpdateEntryRequestDataInner) HasSubfield() bool`

HasSubfield returns a boolean if a field has been set.

### GetValue

`func (o *ModDataUpdateEntryRequestDataInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ModDataUpdateEntryRequestDataInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ModDataUpdateEntryRequestDataInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ModDataUpdateEntryRequestDataInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


