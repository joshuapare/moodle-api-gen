# ModFeedbackGetFeedbacksByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbacks** | [**[]ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner**](ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModFeedbackGetFeedbacksByCourses200Response

`func NewModFeedbackGetFeedbacksByCourses200Response(feedbacks []ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner, ) *ModFeedbackGetFeedbacksByCourses200Response`

NewModFeedbackGetFeedbacksByCourses200Response instantiates a new ModFeedbackGetFeedbacksByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetFeedbacksByCourses200ResponseWithDefaults

`func NewModFeedbackGetFeedbacksByCourses200ResponseWithDefaults() *ModFeedbackGetFeedbacksByCourses200Response`

NewModFeedbackGetFeedbacksByCourses200ResponseWithDefaults instantiates a new ModFeedbackGetFeedbacksByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbacks

`func (o *ModFeedbackGetFeedbacksByCourses200Response) GetFeedbacks() []ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner`

GetFeedbacks returns the Feedbacks field if non-nil, zero value otherwise.

### GetFeedbacksOk

`func (o *ModFeedbackGetFeedbacksByCourses200Response) GetFeedbacksOk() (*[]ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner, bool)`

GetFeedbacksOk returns a tuple with the Feedbacks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbacks

`func (o *ModFeedbackGetFeedbacksByCourses200Response) SetFeedbacks(v []ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner)`

SetFeedbacks sets Feedbacks field to given value.


### GetWarnings

`func (o *ModFeedbackGetFeedbacksByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModFeedbackGetFeedbacksByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModFeedbackGetFeedbacksByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModFeedbackGetFeedbacksByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


