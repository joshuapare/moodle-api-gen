# ModFeedbackGetNonRespondents200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **int32** | Total number of non respondents | [default to null]
**Users** | [**[]ModFeedbackGetNonRespondents200ResponseUsersInner**](ModFeedbackGetNonRespondents200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetNonRespondents200Response

`func NewModFeedbackGetNonRespondents200Response(total int32, users []ModFeedbackGetNonRespondents200ResponseUsersInner, ) *ModFeedbackGetNonRespondents200Response`

NewModFeedbackGetNonRespondents200Response instantiates a new ModFeedbackGetNonRespondents200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetNonRespondents200ResponseWithDefaults

`func NewModFeedbackGetNonRespondents200ResponseWithDefaults() *ModFeedbackGetNonRespondents200Response`

NewModFeedbackGetNonRespondents200ResponseWithDefaults instantiates a new ModFeedbackGetNonRespondents200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotal

`func (o *ModFeedbackGetNonRespondents200Response) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *ModFeedbackGetNonRespondents200Response) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *ModFeedbackGetNonRespondents200Response) SetTotal(v int32)`

SetTotal sets Total field to given value.


### GetUsers

`func (o *ModFeedbackGetNonRespondents200Response) GetUsers() []ModFeedbackGetNonRespondents200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *ModFeedbackGetNonRespondents200Response) GetUsersOk() (*[]ModFeedbackGetNonRespondents200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *ModFeedbackGetNonRespondents200Response) SetUsers(v []ModFeedbackGetNonRespondents200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *ModFeedbackGetNonRespondents200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetNonRespondents200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetNonRespondents200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetNonRespondents200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


