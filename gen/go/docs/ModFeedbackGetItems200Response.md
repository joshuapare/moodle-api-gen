# ModFeedbackGetItems200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]ModFeedbackGetItems200ResponseItemsInner**](ModFeedbackGetItems200ResponseItemsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetItems200Response

`func NewModFeedbackGetItems200Response(items []ModFeedbackGetItems200ResponseItemsInner, ) *ModFeedbackGetItems200Response`

NewModFeedbackGetItems200Response instantiates a new ModFeedbackGetItems200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetItems200ResponseWithDefaults

`func NewModFeedbackGetItems200ResponseWithDefaults() *ModFeedbackGetItems200Response`

NewModFeedbackGetItems200ResponseWithDefaults instantiates a new ModFeedbackGetItems200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *ModFeedbackGetItems200Response) GetItems() []ModFeedbackGetItems200ResponseItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ModFeedbackGetItems200Response) GetItemsOk() (*[]ModFeedbackGetItems200ResponseItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ModFeedbackGetItems200Response) SetItems(v []ModFeedbackGetItems200ResponseItemsInner)`

SetItems sets Items field to given value.


### GetWarnings

`func (o *ModFeedbackGetItems200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetItems200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetItems200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetItems200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


