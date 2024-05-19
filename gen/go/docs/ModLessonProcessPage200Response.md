# ModLessonProcessPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attemptsremaining** | **int32** | Number of attempts remaining. | [default to null]
**Correctanswer** | **bool** | Whether the answer is correct. | [default to null]
**Displaymenu** | **bool** | Whether we should display the menu or not in this page. | 
**Feedback** | **string** | The response feedback. | [default to "null"]
**Inmediatejump** | **bool** | Whether the page processing redirect directly to anoter page. | [default to null]
**Isessayquestion** | **bool** | Whether is a essay question. | [default to null]
**Maxattemptsreached** | **bool** | Whether we reachered the max number of attempts. | [default to null]
**Messages** | [**[]ModLessonGetPageData200ResponseMessagesInner**](ModLessonGetPageData200ResponseMessagesInner.md) |  | 
**Newpageid** | **int32** | New page id (if a jump was made). | [default to null]
**Noanswer** | **bool** | Whether there aren&#39;t answers. | [default to null]
**Nodefaultresponse** | **bool** | Whether there is not a default response. | [default to null]
**Ongoingscore** | **string** | The ongoing message. | [default to "null"]
**Progress** | **int32** | Progress percentage in the lesson. | [default to null]
**Response** | **string** | The response. | [default to "null"]
**Reviewmode** | **bool** | Whether the user is reviewing. | [default to null]
**Studentanswer** | **string** | The student answer. | [default to "null"]
**Userresponse** | **string** | The user response. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonProcessPage200Response

`func NewModLessonProcessPage200Response(attemptsremaining int32, correctanswer bool, displaymenu bool, feedback string, inmediatejump bool, isessayquestion bool, maxattemptsreached bool, messages []ModLessonGetPageData200ResponseMessagesInner, newpageid int32, noanswer bool, nodefaultresponse bool, ongoingscore string, progress int32, response string, reviewmode bool, studentanswer string, userresponse string, ) *ModLessonProcessPage200Response`

NewModLessonProcessPage200Response instantiates a new ModLessonProcessPage200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonProcessPage200ResponseWithDefaults

`func NewModLessonProcessPage200ResponseWithDefaults() *ModLessonProcessPage200Response`

NewModLessonProcessPage200ResponseWithDefaults instantiates a new ModLessonProcessPage200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttemptsremaining

`func (o *ModLessonProcessPage200Response) GetAttemptsremaining() int32`

GetAttemptsremaining returns the Attemptsremaining field if non-nil, zero value otherwise.

### GetAttemptsremainingOk

`func (o *ModLessonProcessPage200Response) GetAttemptsremainingOk() (*int32, bool)`

GetAttemptsremainingOk returns a tuple with the Attemptsremaining field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttemptsremaining

`func (o *ModLessonProcessPage200Response) SetAttemptsremaining(v int32)`

SetAttemptsremaining sets Attemptsremaining field to given value.


### GetCorrectanswer

`func (o *ModLessonProcessPage200Response) GetCorrectanswer() bool`

GetCorrectanswer returns the Correctanswer field if non-nil, zero value otherwise.

### GetCorrectanswerOk

`func (o *ModLessonProcessPage200Response) GetCorrectanswerOk() (*bool, bool)`

GetCorrectanswerOk returns a tuple with the Correctanswer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrectanswer

`func (o *ModLessonProcessPage200Response) SetCorrectanswer(v bool)`

SetCorrectanswer sets Correctanswer field to given value.


### GetDisplaymenu

`func (o *ModLessonProcessPage200Response) GetDisplaymenu() bool`

GetDisplaymenu returns the Displaymenu field if non-nil, zero value otherwise.

### GetDisplaymenuOk

`func (o *ModLessonProcessPage200Response) GetDisplaymenuOk() (*bool, bool)`

GetDisplaymenuOk returns a tuple with the Displaymenu field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplaymenu

`func (o *ModLessonProcessPage200Response) SetDisplaymenu(v bool)`

SetDisplaymenu sets Displaymenu field to given value.


### GetFeedback

`func (o *ModLessonProcessPage200Response) GetFeedback() string`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModLessonProcessPage200Response) GetFeedbackOk() (*string, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModLessonProcessPage200Response) SetFeedback(v string)`

SetFeedback sets Feedback field to given value.


### GetInmediatejump

`func (o *ModLessonProcessPage200Response) GetInmediatejump() bool`

GetInmediatejump returns the Inmediatejump field if non-nil, zero value otherwise.

### GetInmediatejumpOk

`func (o *ModLessonProcessPage200Response) GetInmediatejumpOk() (*bool, bool)`

GetInmediatejumpOk returns a tuple with the Inmediatejump field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInmediatejump

`func (o *ModLessonProcessPage200Response) SetInmediatejump(v bool)`

SetInmediatejump sets Inmediatejump field to given value.


### GetIsessayquestion

`func (o *ModLessonProcessPage200Response) GetIsessayquestion() bool`

GetIsessayquestion returns the Isessayquestion field if non-nil, zero value otherwise.

### GetIsessayquestionOk

`func (o *ModLessonProcessPage200Response) GetIsessayquestionOk() (*bool, bool)`

GetIsessayquestionOk returns a tuple with the Isessayquestion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsessayquestion

`func (o *ModLessonProcessPage200Response) SetIsessayquestion(v bool)`

SetIsessayquestion sets Isessayquestion field to given value.


### GetMaxattemptsreached

`func (o *ModLessonProcessPage200Response) GetMaxattemptsreached() bool`

GetMaxattemptsreached returns the Maxattemptsreached field if non-nil, zero value otherwise.

### GetMaxattemptsreachedOk

`func (o *ModLessonProcessPage200Response) GetMaxattemptsreachedOk() (*bool, bool)`

GetMaxattemptsreachedOk returns a tuple with the Maxattemptsreached field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxattemptsreached

`func (o *ModLessonProcessPage200Response) SetMaxattemptsreached(v bool)`

SetMaxattemptsreached sets Maxattemptsreached field to given value.


### GetMessages

`func (o *ModLessonProcessPage200Response) GetMessages() []ModLessonGetPageData200ResponseMessagesInner`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *ModLessonProcessPage200Response) GetMessagesOk() (*[]ModLessonGetPageData200ResponseMessagesInner, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *ModLessonProcessPage200Response) SetMessages(v []ModLessonGetPageData200ResponseMessagesInner)`

SetMessages sets Messages field to given value.


### GetNewpageid

`func (o *ModLessonProcessPage200Response) GetNewpageid() int32`

GetNewpageid returns the Newpageid field if non-nil, zero value otherwise.

### GetNewpageidOk

`func (o *ModLessonProcessPage200Response) GetNewpageidOk() (*int32, bool)`

GetNewpageidOk returns a tuple with the Newpageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNewpageid

`func (o *ModLessonProcessPage200Response) SetNewpageid(v int32)`

SetNewpageid sets Newpageid field to given value.


### GetNoanswer

`func (o *ModLessonProcessPage200Response) GetNoanswer() bool`

GetNoanswer returns the Noanswer field if non-nil, zero value otherwise.

### GetNoanswerOk

`func (o *ModLessonProcessPage200Response) GetNoanswerOk() (*bool, bool)`

GetNoanswerOk returns a tuple with the Noanswer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNoanswer

`func (o *ModLessonProcessPage200Response) SetNoanswer(v bool)`

SetNoanswer sets Noanswer field to given value.


### GetNodefaultresponse

`func (o *ModLessonProcessPage200Response) GetNodefaultresponse() bool`

GetNodefaultresponse returns the Nodefaultresponse field if non-nil, zero value otherwise.

### GetNodefaultresponseOk

`func (o *ModLessonProcessPage200Response) GetNodefaultresponseOk() (*bool, bool)`

GetNodefaultresponseOk returns a tuple with the Nodefaultresponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNodefaultresponse

`func (o *ModLessonProcessPage200Response) SetNodefaultresponse(v bool)`

SetNodefaultresponse sets Nodefaultresponse field to given value.


### GetOngoingscore

`func (o *ModLessonProcessPage200Response) GetOngoingscore() string`

GetOngoingscore returns the Ongoingscore field if non-nil, zero value otherwise.

### GetOngoingscoreOk

`func (o *ModLessonProcessPage200Response) GetOngoingscoreOk() (*string, bool)`

GetOngoingscoreOk returns a tuple with the Ongoingscore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOngoingscore

`func (o *ModLessonProcessPage200Response) SetOngoingscore(v string)`

SetOngoingscore sets Ongoingscore field to given value.


### GetProgress

`func (o *ModLessonProcessPage200Response) GetProgress() int32`

GetProgress returns the Progress field if non-nil, zero value otherwise.

### GetProgressOk

`func (o *ModLessonProcessPage200Response) GetProgressOk() (*int32, bool)`

GetProgressOk returns a tuple with the Progress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgress

`func (o *ModLessonProcessPage200Response) SetProgress(v int32)`

SetProgress sets Progress field to given value.


### GetResponse

`func (o *ModLessonProcessPage200Response) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *ModLessonProcessPage200Response) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *ModLessonProcessPage200Response) SetResponse(v string)`

SetResponse sets Response field to given value.


### GetReviewmode

`func (o *ModLessonProcessPage200Response) GetReviewmode() bool`

GetReviewmode returns the Reviewmode field if non-nil, zero value otherwise.

### GetReviewmodeOk

`func (o *ModLessonProcessPage200Response) GetReviewmodeOk() (*bool, bool)`

GetReviewmodeOk returns a tuple with the Reviewmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewmode

`func (o *ModLessonProcessPage200Response) SetReviewmode(v bool)`

SetReviewmode sets Reviewmode field to given value.


### GetStudentanswer

`func (o *ModLessonProcessPage200Response) GetStudentanswer() string`

GetStudentanswer returns the Studentanswer field if non-nil, zero value otherwise.

### GetStudentanswerOk

`func (o *ModLessonProcessPage200Response) GetStudentanswerOk() (*string, bool)`

GetStudentanswerOk returns a tuple with the Studentanswer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStudentanswer

`func (o *ModLessonProcessPage200Response) SetStudentanswer(v string)`

SetStudentanswer sets Studentanswer field to given value.


### GetUserresponse

`func (o *ModLessonProcessPage200Response) GetUserresponse() string`

GetUserresponse returns the Userresponse field if non-nil, zero value otherwise.

### GetUserresponseOk

`func (o *ModLessonProcessPage200Response) GetUserresponseOk() (*string, bool)`

GetUserresponseOk returns a tuple with the Userresponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserresponse

`func (o *ModLessonProcessPage200Response) SetUserresponse(v string)`

SetUserresponse sets Userresponse field to given value.


### GetWarnings

`func (o *ModLessonProcessPage200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonProcessPage200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonProcessPage200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonProcessPage200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


