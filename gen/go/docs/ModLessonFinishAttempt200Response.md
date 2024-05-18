# ModLessonFinishAttempt200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**[]ModLessonFinishAttempt200ResponseDataInner**](ModLessonFinishAttempt200ResponseDataInner.md) |  | 
**Messages** | [**[]ModLessonFinishAttempt200ResponseMessagesInner**](ModLessonFinishAttempt200ResponseMessagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonFinishAttempt200Response

`func NewModLessonFinishAttempt200Response(data []ModLessonFinishAttempt200ResponseDataInner, messages []ModLessonFinishAttempt200ResponseMessagesInner, ) *ModLessonFinishAttempt200Response`

NewModLessonFinishAttempt200Response instantiates a new ModLessonFinishAttempt200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonFinishAttempt200ResponseWithDefaults

`func NewModLessonFinishAttempt200ResponseWithDefaults() *ModLessonFinishAttempt200Response`

NewModLessonFinishAttempt200ResponseWithDefaults instantiates a new ModLessonFinishAttempt200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModLessonFinishAttempt200Response) GetData() []ModLessonFinishAttempt200ResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModLessonFinishAttempt200Response) GetDataOk() (*[]ModLessonFinishAttempt200ResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModLessonFinishAttempt200Response) SetData(v []ModLessonFinishAttempt200ResponseDataInner)`

SetData sets Data field to given value.


### GetMessages

`func (o *ModLessonFinishAttempt200Response) GetMessages() []ModLessonFinishAttempt200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModLessonFinishAttempt200Response) GetMessagesOk() (*[]ModLessonFinishAttempt200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModLessonFinishAttempt200Response) SetMessages(v []ModLessonFinishAttempt200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetWarnings

`func (o *ModLessonFinishAttempt200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonFinishAttempt200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonFinishAttempt200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonFinishAttempt200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


