# ModFeedbackGetPageItems200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hasnextpage** | **bool** | Whether there are more pages. | [default to null]
**Hasprevpage** | **bool** | Whether is a previous page. | [default to null]
**Items** | [**[]ModFeedbackGetItems200ResponseItemsInner**](ModFeedbackGetItems200ResponseItemsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetPageItems200Response

`func NewModFeedbackGetPageItems200Response(hasnextpage bool, hasprevpage bool, items []ModFeedbackGetItems200ResponseItemsInner, ) *ModFeedbackGetPageItems200Response`

NewModFeedbackGetPageItems200Response instantiates a new ModFeedbackGetPageItems200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetPageItems200ResponseWithDefaults

`func NewModFeedbackGetPageItems200ResponseWithDefaults() *ModFeedbackGetPageItems200Response`

NewModFeedbackGetPageItems200ResponseWithDefaults instantiates a new ModFeedbackGetPageItems200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHasnextpage

`func (o *ModFeedbackGetPageItems200Response) GetHasnextpage() bool`

GetHasnextpage returns the Hasnextpage field if non-nil, zero value otherwise.

### GetHasnextpageOk

`func (o *ModFeedbackGetPageItems200Response) GetHasnextpageOk() (*bool, bool)`

GetHasnextpageOk returns a tuple with the Hasnextpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasnextpage

`func (o *ModFeedbackGetPageItems200Response) SetHasnextpage(v bool)`

SetHasnextpage sets Hasnextpage field to given value.


### GetHasprevpage

`func (o *ModFeedbackGetPageItems200Response) GetHasprevpage() bool`

GetHasprevpage returns the Hasprevpage field if non-nil, zero value otherwise.

### GetHasprevpageOk

`func (o *ModFeedbackGetPageItems200Response) GetHasprevpageOk() (*bool, bool)`

GetHasprevpageOk returns a tuple with the Hasprevpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasprevpage

`func (o *ModFeedbackGetPageItems200Response) SetHasprevpage(v bool)`

SetHasprevpage sets Hasprevpage field to given value.


### GetItems

`func (o *ModFeedbackGetPageItems200Response) GetItems() []ModFeedbackGetItems200ResponseItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ModFeedbackGetPageItems200Response) GetItemsOk() (*[]ModFeedbackGetItems200ResponseItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ModFeedbackGetPageItems200Response) SetItems(v []ModFeedbackGetItems200ResponseItemsInner)`

SetItems sets Items field to given value.


### GetWarnings

`func (o *ModFeedbackGetPageItems200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetPageItems200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetPageItems200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetPageItems200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


