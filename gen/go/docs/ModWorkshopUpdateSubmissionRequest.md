# ModWorkshopUpdateSubmissionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachmentsid** | Pointer to **int32** | The draft file area id for attachments | [optional] [default to 0]
**Content** | Pointer to **string** | Submission text content | [optional] [default to ""]
**Contentformat** | Pointer to **int32** | The format used for the content | [optional] [default to 0]
**Inlineattachmentsid** | Pointer to **int32** | The draft file area id for inline attachments in the content | [optional] [default to 0]
**Submissionid** | **int32** | Submission id | 
**Title** | **string** | Submission title | 

## Methods

### NewModWorkshopUpdateSubmissionRequest

`func NewModWorkshopUpdateSubmissionRequest(submissionid int32, title string, ) *ModWorkshopUpdateSubmissionRequest`

NewModWorkshopUpdateSubmissionRequest instantiates a new ModWorkshopUpdateSubmissionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopUpdateSubmissionRequestWithDefaults

`func NewModWorkshopUpdateSubmissionRequestWithDefaults() *ModWorkshopUpdateSubmissionRequest`

NewModWorkshopUpdateSubmissionRequestWithDefaults instantiates a new ModWorkshopUpdateSubmissionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachmentsid

`func (o *ModWorkshopUpdateSubmissionRequest) GetAttachmentsid() int32`

GetAttachmentsid returns the Attachmentsid field if non-nil, zero value otherwise.

### GetAttachmentsidOk

`func (o *ModWorkshopUpdateSubmissionRequest) GetAttachmentsidOk() (*int32, bool)`

GetAttachmentsidOk returns a tuple with the Attachmentsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachmentsid

`func (o *ModWorkshopUpdateSubmissionRequest) SetAttachmentsid(v int32)`

SetAttachmentsid sets Attachmentsid field to given value.

### HasAttachmentsid

`func (o *ModWorkshopUpdateSubmissionRequest) HasAttachmentsid() bool`

HasAttachmentsid returns a boolean if a field has been set.

### GetContent

`func (o *ModWorkshopUpdateSubmissionRequest) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWorkshopUpdateSubmissionRequest) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWorkshopUpdateSubmissionRequest) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ModWorkshopUpdateSubmissionRequest) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContentformat

`func (o *ModWorkshopUpdateSubmissionRequest) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWorkshopUpdateSubmissionRequest) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWorkshopUpdateSubmissionRequest) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWorkshopUpdateSubmissionRequest) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetInlineattachmentsid

`func (o *ModWorkshopUpdateSubmissionRequest) GetInlineattachmentsid() int32`

GetInlineattachmentsid returns the Inlineattachmentsid field if non-nil, zero value otherwise.

### GetInlineattachmentsidOk

`func (o *ModWorkshopUpdateSubmissionRequest) GetInlineattachmentsidOk() (*int32, bool)`

GetInlineattachmentsidOk returns a tuple with the Inlineattachmentsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInlineattachmentsid

`func (o *ModWorkshopUpdateSubmissionRequest) SetInlineattachmentsid(v int32)`

SetInlineattachmentsid sets Inlineattachmentsid field to given value.

### HasInlineattachmentsid

`func (o *ModWorkshopUpdateSubmissionRequest) HasInlineattachmentsid() bool`

HasInlineattachmentsid returns a boolean if a field has been set.

### GetSubmissionid

`func (o *ModWorkshopUpdateSubmissionRequest) GetSubmissionid() int32`

GetSubmissionid returns the Submissionid field if non-nil, zero value otherwise.

### GetSubmissionidOk

`func (o *ModWorkshopUpdateSubmissionRequest) GetSubmissionidOk() (*int32, bool)`

GetSubmissionidOk returns a tuple with the Submissionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmissionid

`func (o *ModWorkshopUpdateSubmissionRequest) SetSubmissionid(v int32)`

SetSubmissionid sets Submissionid field to given value.


### GetTitle

`func (o *ModWorkshopUpdateSubmissionRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWorkshopUpdateSubmissionRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWorkshopUpdateSubmissionRequest) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


