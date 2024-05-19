# ModGlossaryGetEntriesByAuthor200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | Pointer to **bool** | Whether the entry was approved | [optional] [default to null]
**Attachment** | Pointer to **bool** | Whether or not the entry has attachments | [optional] [default to null]
**Attachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Casesensitive** | Pointer to **bool** | When true, the matching is case sensitive | [optional] [default to null]
**Concept** | Pointer to **string** | The concept | [optional] [default to "null"]
**Definition** | Pointer to **string** | The definition | [optional] [default to "null"]
**Definitionformat** | Pointer to **int32** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Definitioninlinefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Definitiontrust** | Pointer to **bool** | The definition trust flag | [optional] [default to null]
**Fullmatch** | Pointer to **bool** | When true, the matching is done on full words only | [optional] [default to null]
**Glossaryid** | Pointer to **int32** | The glossary ID | [optional] 
**Id** | Pointer to **int32** | The entry ID | [optional] [default to null]
**Sourceglossaryid** | Pointer to **int32** | The source glossary ID | [optional] [default to null]
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Teacherentry** | Pointer to **bool** | The entry was created by a teacher, or equivalent. | [optional] [default to null]
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timemodified** | Pointer to **int32** | Time modified | [optional] 
**Usedynalink** | Pointer to **bool** | Whether the concept should be automatically linked | [optional] [default to null]
**Userfullname** | Pointer to **string** | Author full name | [optional] [default to "null"]
**Userid** | Pointer to **int32** | Author ID | [optional] [default to null]
**Userpictureurl** | Pointer to **string** | Author picture | [optional] [default to "null"]

## Methods

### NewModGlossaryGetEntriesByAuthor200ResponseEntriesInner

`func NewModGlossaryGetEntriesByAuthor200ResponseEntriesInner() *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner`

NewModGlossaryGetEntriesByAuthor200ResponseEntriesInner instantiates a new ModGlossaryGetEntriesByAuthor200ResponseEntriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByAuthor200ResponseEntriesInnerWithDefaults

`func NewModGlossaryGetEntriesByAuthor200ResponseEntriesInnerWithDefaults() *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner`

NewModGlossaryGetEntriesByAuthor200ResponseEntriesInnerWithDefaults instantiates a new ModGlossaryGetEntriesByAuthor200ResponseEntriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApproved

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetApproved() bool`

GetApproved returns the Approved field if non-nil, zero value otherwise.

### GetApprovedOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetApprovedOk() (*bool, bool)`

GetApprovedOk returns a tuple with the Approved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproved

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetApproved(v bool)`

SetApproved sets Approved field to given value.

### HasApproved

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasApproved() bool`

HasApproved returns a boolean if a field has been set.

### GetAttachment

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetAttachment() bool`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetAttachmentOk() (*bool, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetAttachment(v bool)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachments

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetAttachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetCasesensitive

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetCasesensitive() bool`

GetCasesensitive returns the Casesensitive field if non-nil, zero value otherwise.

### GetCasesensitiveOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetCasesensitiveOk() (*bool, bool)`

GetCasesensitiveOk returns a tuple with the Casesensitive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCasesensitive

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetCasesensitive(v bool)`

SetCasesensitive sets Casesensitive field to given value.

### HasCasesensitive

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasCasesensitive() bool`

HasCasesensitive returns a boolean if a field has been set.

### GetConcept

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetConcept() string`

GetConcept returns the Concept field if non-nil, zero value otherwise.

### GetConceptOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetConceptOk() (*string, bool)`

GetConceptOk returns a tuple with the Concept field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConcept

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetConcept(v string)`

SetConcept sets Concept field to given value.

### HasConcept

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasConcept() bool`

HasConcept returns a boolean if a field has been set.

### GetDefinition

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetDefinition(v string)`

SetDefinition sets Definition field to given value.

### HasDefinition

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasDefinition() bool`

HasDefinition returns a boolean if a field has been set.

### GetDefinitionformat

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitionformat() int32`

GetDefinitionformat returns the Definitionformat field if non-nil, zero value otherwise.

### GetDefinitionformatOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitionformatOk() (*int32, bool)`

GetDefinitionformatOk returns a tuple with the Definitionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitionformat

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetDefinitionformat(v int32)`

SetDefinitionformat sets Definitionformat field to given value.

### HasDefinitionformat

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasDefinitionformat() bool`

HasDefinitionformat returns a boolean if a field has been set.

### GetDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitioninlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetDefinitioninlinefiles returns the Definitioninlinefiles field if non-nil, zero value otherwise.

### GetDefinitioninlinefilesOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitioninlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetDefinitioninlinefilesOk returns a tuple with the Definitioninlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetDefinitioninlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetDefinitioninlinefiles sets Definitioninlinefiles field to given value.

### HasDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasDefinitioninlinefiles() bool`

HasDefinitioninlinefiles returns a boolean if a field has been set.

### GetDefinitiontrust

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitiontrust() bool`

GetDefinitiontrust returns the Definitiontrust field if non-nil, zero value otherwise.

### GetDefinitiontrustOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetDefinitiontrustOk() (*bool, bool)`

GetDefinitiontrustOk returns a tuple with the Definitiontrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitiontrust

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetDefinitiontrust(v bool)`

SetDefinitiontrust sets Definitiontrust field to given value.

### HasDefinitiontrust

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasDefinitiontrust() bool`

HasDefinitiontrust returns a boolean if a field has been set.

### GetFullmatch

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetFullmatch() bool`

GetFullmatch returns the Fullmatch field if non-nil, zero value otherwise.

### GetFullmatchOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetFullmatchOk() (*bool, bool)`

GetFullmatchOk returns a tuple with the Fullmatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmatch

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetFullmatch(v bool)`

SetFullmatch sets Fullmatch field to given value.

### HasFullmatch

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasFullmatch() bool`

HasFullmatch returns a boolean if a field has been set.

### GetGlossaryid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetGlossaryid() int32`

GetGlossaryid returns the Glossaryid field if non-nil, zero value otherwise.

### GetGlossaryidOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetGlossaryidOk() (*int32, bool)`

GetGlossaryidOk returns a tuple with the Glossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlossaryid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetGlossaryid(v int32)`

SetGlossaryid sets Glossaryid field to given value.

### HasGlossaryid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasGlossaryid() bool`

HasGlossaryid returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetSourceglossaryid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetSourceglossaryid() int32`

GetSourceglossaryid returns the Sourceglossaryid field if non-nil, zero value otherwise.

### GetSourceglossaryidOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetSourceglossaryidOk() (*int32, bool)`

GetSourceglossaryidOk returns a tuple with the Sourceglossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceglossaryid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetSourceglossaryid(v int32)`

SetSourceglossaryid sets Sourceglossaryid field to given value.

### HasSourceglossaryid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasSourceglossaryid() bool`

HasSourceglossaryid returns a boolean if a field has been set.

### GetTags

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTeacherentry

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTeacherentry() bool`

GetTeacherentry returns the Teacherentry field if non-nil, zero value otherwise.

### GetTeacherentryOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTeacherentryOk() (*bool, bool)`

GetTeacherentryOk returns a tuple with the Teacherentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeacherentry

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetTeacherentry(v bool)`

SetTeacherentry sets Teacherentry field to given value.

### HasTeacherentry

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasTeacherentry() bool`

HasTeacherentry returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsedynalink

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUsedynalink() bool`

GetUsedynalink returns the Usedynalink field if non-nil, zero value otherwise.

### GetUsedynalinkOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUsedynalinkOk() (*bool, bool)`

GetUsedynalinkOk returns a tuple with the Usedynalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedynalink

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetUsedynalink(v bool)`

SetUsedynalink sets Usedynalink field to given value.

### HasUsedynalink

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasUsedynalink() bool`

HasUsedynalink returns a boolean if a field has been set.

### GetUserfullname

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUserpictureurl

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.

### HasUserpictureurl

`func (o *ModGlossaryGetEntriesByAuthor200ResponseEntriesInner) HasUserpictureurl() bool`

HasUserpictureurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


