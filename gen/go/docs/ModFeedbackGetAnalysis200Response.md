# ModFeedbackGetAnalysis200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Completedcount** | **int32** | Number of completed submissions. | [default to null]
**Itemscount** | **int32** | Number of items (questions). | [default to null]
**Itemsdata** | [**[]ModFeedbackGetAnalysis200ResponseItemsdataInner**](ModFeedbackGetAnalysis200ResponseItemsdataInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetAnalysis200Response

`func NewModFeedbackGetAnalysis200Response(completedcount int32, itemscount int32, itemsdata []ModFeedbackGetAnalysis200ResponseItemsdataInner, ) *ModFeedbackGetAnalysis200Response`

NewModFeedbackGetAnalysis200Response instantiates a new ModFeedbackGetAnalysis200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetAnalysis200ResponseWithDefaults

`func NewModFeedbackGetAnalysis200ResponseWithDefaults() *ModFeedbackGetAnalysis200Response`

NewModFeedbackGetAnalysis200ResponseWithDefaults instantiates a new ModFeedbackGetAnalysis200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletedcount

`func (o *ModFeedbackGetAnalysis200Response) GetCompletedcount() int32`

GetCompletedcount returns the Completedcount field if non-nil, zero value otherwise.

### GetCompletedcountOk

`func (o *ModFeedbackGetAnalysis200Response) GetCompletedcountOk() (*int32, bool)`

GetCompletedcountOk returns a tuple with the Completedcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletedcount

`func (o *ModFeedbackGetAnalysis200Response) SetCompletedcount(v int32)`

SetCompletedcount sets Completedcount field to given value.


### GetItemscount

`func (o *ModFeedbackGetAnalysis200Response) GetItemscount() int32`

GetItemscount returns the Itemscount field if non-nil, zero value otherwise.

### GetItemscountOk

`func (o *ModFeedbackGetAnalysis200Response) GetItemscountOk() (*int32, bool)`

GetItemscountOk returns a tuple with the Itemscount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemscount

`func (o *ModFeedbackGetAnalysis200Response) SetItemscount(v int32)`

SetItemscount sets Itemscount field to given value.


### GetItemsdata

`func (o *ModFeedbackGetAnalysis200Response) GetItemsdata() []ModFeedbackGetAnalysis200ResponseItemsdataInner`

GetItemsdata returns the Itemsdata field if non-nil, zero value otherwise.

### GetItemsdataOk

`func (o *ModFeedbackGetAnalysis200Response) GetItemsdataOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInner, bool)`

GetItemsdataOk returns a tuple with the Itemsdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemsdata

`func (o *ModFeedbackGetAnalysis200Response) SetItemsdata(v []ModFeedbackGetAnalysis200ResponseItemsdataInner)`

SetItemsdata sets Itemsdata field to given value.


### GetWarnings

`func (o *ModFeedbackGetAnalysis200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetAnalysis200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetAnalysis200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetAnalysis200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


