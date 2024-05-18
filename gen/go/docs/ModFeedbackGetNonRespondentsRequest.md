# ModFeedbackGetNonRespondentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int32** | Feedback instance id | 
**Groupid** | Pointer to **int32** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**Page** | Pointer to **int32** | The page of records to return. | [optional] [default to 0]
**Perpage** | Pointer to **int32** | The number of records to return per page. | [optional] [default to 0]
**Sort** | Pointer to **string** | Sort param, must be firstname, lastname or lastaccess (default). | [optional] [default to "lastaccess"]

## Methods

### NewModFeedbackGetNonRespondentsRequest

`func NewModFeedbackGetNonRespondentsRequest(feedbackid int32, ) *ModFeedbackGetNonRespondentsRequest`

NewModFeedbackGetNonRespondentsRequest instantiates a new ModFeedbackGetNonRespondentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetNonRespondentsRequestWithDefaults

`func NewModFeedbackGetNonRespondentsRequestWithDefaults() *ModFeedbackGetNonRespondentsRequest`

NewModFeedbackGetNonRespondentsRequestWithDefaults instantiates a new ModFeedbackGetNonRespondentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModFeedbackGetNonRespondentsRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackGetNonRespondentsRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackGetNonRespondentsRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *ModFeedbackGetNonRespondentsRequest) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetFeedbackid

`func (o *ModFeedbackGetNonRespondentsRequest) GetFeedbackid() int32`

GetFeedbackid returns the Feedbackid field if non-nil, zero value otherwise.

### GetFeedbackidOk

`func (o *ModFeedbackGetNonRespondentsRequest) GetFeedbackidOk() (*int32, bool)`

GetFeedbackidOk returns a tuple with the Feedbackid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackid

`func (o *ModFeedbackGetNonRespondentsRequest) SetFeedbackid(v int32)`

SetFeedbackid sets Feedbackid field to given value.


### GetGroupid

`func (o *ModFeedbackGetNonRespondentsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModFeedbackGetNonRespondentsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModFeedbackGetNonRespondentsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *ModFeedbackGetNonRespondentsRequest) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetPage

`func (o *ModFeedbackGetNonRespondentsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *ModFeedbackGetNonRespondentsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *ModFeedbackGetNonRespondentsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *ModFeedbackGetNonRespondentsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetPerpage

`func (o *ModFeedbackGetNonRespondentsRequest) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *ModFeedbackGetNonRespondentsRequest) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *ModFeedbackGetNonRespondentsRequest) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *ModFeedbackGetNonRespondentsRequest) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetSort

`func (o *ModFeedbackGetNonRespondentsRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *ModFeedbackGetNonRespondentsRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *ModFeedbackGetNonRespondentsRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *ModFeedbackGetNonRespondentsRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


