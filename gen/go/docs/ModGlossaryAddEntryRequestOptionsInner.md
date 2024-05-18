# ModGlossaryAddEntryRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The allowed keys (value format) are:                             inlineattachmentsid (int); the draft file area id for inline attachments                             attachmentsid (int); the draft file area id for attachments                             categories (comma separated int); comma separated category ids                             aliases (comma separated str); comma separated aliases                             usedynalink (bool); whether the entry should be automatically linked.                             casesensitive (bool); whether the entry is case sensitive.                             fullmatch (bool); whether to match whole words only. | [optional] [default to "null"]
**Value** | Pointer to **string** | the value of the option (validated inside the function) | [optional] [default to "null"]

## Methods

### NewModGlossaryAddEntryRequestOptionsInner

`func NewModGlossaryAddEntryRequestOptionsInner() *ModGlossaryAddEntryRequestOptionsInner`

NewModGlossaryAddEntryRequestOptionsInner instantiates a new ModGlossaryAddEntryRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryAddEntryRequestOptionsInnerWithDefaults

`func NewModGlossaryAddEntryRequestOptionsInnerWithDefaults() *ModGlossaryAddEntryRequestOptionsInner`

NewModGlossaryAddEntryRequestOptionsInnerWithDefaults instantiates a new ModGlossaryAddEntryRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ModGlossaryAddEntryRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModGlossaryAddEntryRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModGlossaryAddEntryRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModGlossaryAddEntryRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *ModGlossaryAddEntryRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ModGlossaryAddEntryRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ModGlossaryAddEntryRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *ModGlossaryAddEntryRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


