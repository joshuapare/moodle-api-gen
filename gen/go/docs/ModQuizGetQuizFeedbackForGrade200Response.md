# ModQuizGetQuizFeedbackForGrade200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Feedbackinlinefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Feedbacktext** | **string** | the comment that corresponds to this grade (empty for none) | [default to "null"]
**Feedbacktextformat** | Pointer to **int32** | feedbacktext format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModQuizGetQuizFeedbackForGrade200Response

`func NewModQuizGetQuizFeedbackForGrade200Response(feedbacktext string, ) *ModQuizGetQuizFeedbackForGrade200Response`

NewModQuizGetQuizFeedbackForGrade200Response instantiates a new ModQuizGetQuizFeedbackForGrade200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetQuizFeedbackForGrade200ResponseWithDefaults

`func NewModQuizGetQuizFeedbackForGrade200ResponseWithDefaults() *ModQuizGetQuizFeedbackForGrade200Response`

NewModQuizGetQuizFeedbackForGrade200ResponseWithDefaults instantiates a new ModQuizGetQuizFeedbackForGrade200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbackinlinefiles

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetFeedbackinlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetFeedbackinlinefiles returns the Feedbackinlinefiles field if non-nil, zero value otherwise.

### GetFeedbackinlinefilesOk

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetFeedbackinlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetFeedbackinlinefilesOk returns a tuple with the Feedbackinlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackinlinefiles

`func (o *ModQuizGetQuizFeedbackForGrade200Response) SetFeedbackinlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetFeedbackinlinefiles sets Feedbackinlinefiles field to given value.

### HasFeedbackinlinefiles

`func (o *ModQuizGetQuizFeedbackForGrade200Response) HasFeedbackinlinefiles() bool`

HasFeedbackinlinefiles returns a boolean if a field has been set.

### GetFeedbacktext

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetFeedbacktext() string`

GetFeedbacktext returns the Feedbacktext field if non-nil, zero value otherwise.

### GetFeedbacktextOk

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetFeedbacktextOk() (*string, bool)`

GetFeedbacktextOk returns a tuple with the Feedbacktext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbacktext

`func (o *ModQuizGetQuizFeedbackForGrade200Response) SetFeedbacktext(v string)`

SetFeedbacktext sets Feedbacktext field to given value.


### GetFeedbacktextformat

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetFeedbacktextformat() int32`

GetFeedbacktextformat returns the Feedbacktextformat field if non-nil, zero value otherwise.

### GetFeedbacktextformatOk

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetFeedbacktextformatOk() (*int32, bool)`

GetFeedbacktextformatOk returns a tuple with the Feedbacktextformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbacktextformat

`func (o *ModQuizGetQuizFeedbackForGrade200Response) SetFeedbacktextformat(v int32)`

SetFeedbacktextformat sets Feedbacktextformat field to given value.

### HasFeedbacktextformat

`func (o *ModQuizGetQuizFeedbackForGrade200Response) HasFeedbacktextformat() bool`

HasFeedbacktextformat returns a boolean if a field has been set.

### GetWarnings

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModQuizGetQuizFeedbackForGrade200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModQuizGetQuizFeedbackForGrade200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModQuizGetQuizFeedbackForGrade200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


