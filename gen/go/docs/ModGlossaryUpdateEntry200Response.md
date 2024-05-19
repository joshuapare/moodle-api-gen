# ModGlossaryUpdateEntry200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **bool** | The update result | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModGlossaryUpdateEntry200Response

`func NewModGlossaryUpdateEntry200Response(result bool, ) *ModGlossaryUpdateEntry200Response`

NewModGlossaryUpdateEntry200Response instantiates a new ModGlossaryUpdateEntry200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryUpdateEntry200ResponseWithDefaults

`func NewModGlossaryUpdateEntry200ResponseWithDefaults() *ModGlossaryUpdateEntry200Response`

NewModGlossaryUpdateEntry200ResponseWithDefaults instantiates a new ModGlossaryUpdateEntry200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *ModGlossaryUpdateEntry200Response) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ModGlossaryUpdateEntry200Response) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ModGlossaryUpdateEntry200Response) SetResult(v bool)`

SetResult sets Result field to given value.


### GetWarnings

`func (o *ModGlossaryUpdateEntry200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModGlossaryUpdateEntry200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModGlossaryUpdateEntry200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModGlossaryUpdateEntry200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


