# CoreContentbankDeleteContent200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **bool** | The processing result | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreContentbankDeleteContent200Response

`func NewCoreContentbankDeleteContent200Response(result bool, ) *CoreContentbankDeleteContent200Response`

NewCoreContentbankDeleteContent200Response instantiates a new CoreContentbankDeleteContent200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreContentbankDeleteContent200ResponseWithDefaults

`func NewCoreContentbankDeleteContent200ResponseWithDefaults() *CoreContentbankDeleteContent200Response`

NewCoreContentbankDeleteContent200ResponseWithDefaults instantiates a new CoreContentbankDeleteContent200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *CoreContentbankDeleteContent200Response) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *CoreContentbankDeleteContent200Response) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *CoreContentbankDeleteContent200Response) SetResult(v bool)`

SetResult sets Result field to given value.


### GetWarnings

`func (o *CoreContentbankDeleteContent200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreContentbankDeleteContent200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreContentbankDeleteContent200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreContentbankDeleteContent200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


