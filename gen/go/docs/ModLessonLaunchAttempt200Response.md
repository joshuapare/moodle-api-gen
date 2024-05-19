# ModLessonLaunchAttempt200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**[]ModLessonGetPageData200ResponseMessagesInner**](ModLessonGetPageData200ResponseMessagesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonLaunchAttempt200Response

`func NewModLessonLaunchAttempt200Response(messages []ModLessonGetPageData200ResponseMessagesInner, ) *ModLessonLaunchAttempt200Response`

NewModLessonLaunchAttempt200Response instantiates a new ModLessonLaunchAttempt200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonLaunchAttempt200ResponseWithDefaults

`func NewModLessonLaunchAttempt200ResponseWithDefaults() *ModLessonLaunchAttempt200Response`

NewModLessonLaunchAttempt200ResponseWithDefaults instantiates a new ModLessonLaunchAttempt200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessages

`func (o *ModLessonLaunchAttempt200Response) GetMessages() []ModLessonGetPageData200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModLessonLaunchAttempt200Response) GetMessagesOk() (*[]ModLessonGetPageData200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModLessonLaunchAttempt200Response) SetMessages(v []ModLessonGetPageData200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetWarnings

`func (o *ModLessonLaunchAttempt200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonLaunchAttempt200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonLaunchAttempt200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonLaunchAttempt200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


