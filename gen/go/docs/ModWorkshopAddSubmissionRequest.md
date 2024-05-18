# ModWorkshopAddSubmissionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachmentsid** | Pointer to **int32** | The draft file area id for attachments | [optional] [default to 0]
**Content** | Pointer to **string** | Submission text content | [optional] [default to ""]
**Contentformat** | Pointer to **int32** | The format used for the content | [optional] [default to 0]
**Inlineattachmentsid** | Pointer to **int32** | The draft file area id for inline attachments in the content | [optional] [default to 0]
**Title** | **string** | Submission title | [default to "null"]
**Workshopid** | **int32** | Workshop id | [default to null]

## Methods

### NewModWorkshopAddSubmissionRequest

`func NewModWorkshopAddSubmissionRequest(title string, workshopid int32, ) *ModWorkshopAddSubmissionRequest`

NewModWorkshopAddSubmissionRequest instantiates a new ModWorkshopAddSubmissionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModWorkshopAddSubmissionRequestWithDefaults

`func NewModWorkshopAddSubmissionRequestWithDefaults() *ModWorkshopAddSubmissionRequest`

NewModWorkshopAddSubmissionRequestWithDefaults instantiates a new ModWorkshopAddSubmissionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachmentsid

`func (o *ModWorkshopAddSubmissionRequest) GetAttachmentsid() int32`

GetAttachmentsid returns the Attachmentsid field if non-nil, zero value otherwise.

### GetAttachmentsidOk

`func (o *ModWorkshopAddSubmissionRequest) GetAttachmentsidOk() (*int32, bool)`

GetAttachmentsidOk returns a tuple with the Attachmentsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachmentsid

`func (o *ModWorkshopAddSubmissionRequest) SetAttachmentsid(v int32)`

SetAttachmentsid sets Attachmentsid field to given value.

### HasAttachmentsid

`func (o *ModWorkshopAddSubmissionRequest) HasAttachmentsid() bool`

HasAttachmentsid returns a boolean if a field has been set.

### GetContent

`func (o *ModWorkshopAddSubmissionRequest) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *ModWorkshopAddSubmissionRequest) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *ModWorkshopAddSubmissionRequest) SetContent(v string)`

SetContent sets Content field to given value.

### HasContent

`func (o *ModWorkshopAddSubmissionRequest) HasContent() bool`

HasContent returns a boolean if a field has been set.

### GetContentformat

`func (o *ModWorkshopAddSubmissionRequest) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *ModWorkshopAddSubmissionRequest) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *ModWorkshopAddSubmissionRequest) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.

### HasContentformat

`func (o *ModWorkshopAddSubmissionRequest) HasContentformat() bool`

HasContentformat returns a boolean if a field has been set.

### GetInlineattachmentsid

`func (o *ModWorkshopAddSubmissionRequest) GetInlineattachmentsid() int32`

GetInlineattachmentsid returns the Inlineattachmentsid field if non-nil, zero value otherwise.

### GetInlineattachmentsidOk

`func (o *ModWorkshopAddSubmissionRequest) GetInlineattachmentsidOk() (*int32, bool)`

GetInlineattachmentsidOk returns a tuple with the Inlineattachmentsid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInlineattachmentsid

`func (o *ModWorkshopAddSubmissionRequest) SetInlineattachmentsid(v int32)`

SetInlineattachmentsid sets Inlineattachmentsid field to given value.

### HasInlineattachmentsid

`func (o *ModWorkshopAddSubmissionRequest) HasInlineattachmentsid() bool`

HasInlineattachmentsid returns a boolean if a field has been set.

### GetTitle

`func (o *ModWorkshopAddSubmissionRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ModWorkshopAddSubmissionRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ModWorkshopAddSubmissionRequest) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetWorkshopid

`func (o *ModWorkshopAddSubmissionRequest) GetWorkshopid() int32`

GetWorkshopid returns the Workshopid field if non-nil, zero value otherwise.

### GetWorkshopidOk

`func (o *ModWorkshopAddSubmissionRequest) GetWorkshopidOk() (*int32, bool)`

GetWorkshopidOk returns a tuple with the Workshopid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkshopid

`func (o *ModWorkshopAddSubmissionRequest) SetWorkshopid(v int32)`

SetWorkshopid sets Workshopid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


