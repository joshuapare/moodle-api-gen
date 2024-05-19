# ModGlossaryAddEntry200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Entryid** | **int32** | New glossary entry ID | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryAddEntry200Response

`func NewModGlossaryAddEntry200Response(entryid int32, ) *ModGlossaryAddEntry200Response`

NewModGlossaryAddEntry200Response instantiates a new ModGlossaryAddEntry200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryAddEntry200ResponseWithDefaults

`func NewModGlossaryAddEntry200ResponseWithDefaults() *ModGlossaryAddEntry200Response`

NewModGlossaryAddEntry200ResponseWithDefaults instantiates a new ModGlossaryAddEntry200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryid

`func (o *ModGlossaryAddEntry200Response) GetEntryid() int32`

GetEntryid returns the Entryid field if non-nil, zero value otherwise.

### GetEntryidOk

`func (o *ModGlossaryAddEntry200Response) GetEntryidOk() (*int32, bool)`

GetEntryidOk returns a tuple with the Entryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryid

`func (o *ModGlossaryAddEntry200Response) SetEntryid(v int32)`

SetEntryid sets Entryid field to given value.


### GetWarnings

`func (o *ModGlossaryAddEntry200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryAddEntry200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryAddEntry200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryAddEntry200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


