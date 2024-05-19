# ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | Pointer to **bool** | Whether the entry was approved | [optional] 
**Attachment** | Pointer to **bool** | Whether or not the entry has attachments | [optional] 
**Attachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Casesensitive** | Pointer to **bool** | When true, the matching is case sensitive | [optional] 
**Concept** | Pointer to **string** | The concept | [optional] 
**Definition** | Pointer to **string** | The definition | [optional] 
**Definitionformat** | Pointer to **int32** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Definitioninlinefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Definitiontrust** | Pointer to **bool** | The definition trust flag | [optional] 
**Fullmatch** | Pointer to **bool** | When true, the matching is done on full words only | [optional] 
**Glossaryid** | Pointer to **int32** | The glossary ID | [optional] 
**Id** | Pointer to **int32** | The entry ID | [optional] 
**Sourceglossaryid** | Pointer to **int32** | The source glossary ID | [optional] 
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Teacherentry** | Pointer to **bool** | The entry was created by a teacher, or equivalent. | [optional] 
**Timecreated** | Pointer to **int32** | Time created | [optional] 
**Timemodified** | Pointer to **int32** | Time modified | [optional] 
**Usedynalink** | Pointer to **bool** | Whether the concept should be automatically linked | [optional] 
**Userfullname** | Pointer to **string** | Author full name | [optional] 
**Userid** | Pointer to **int32** | Author ID | [optional] 
**Userpictureurl** | Pointer to **string** | Author picture | [optional] 

## Methods

### NewModGlossaryGetEntriesByAuthorId200ResponseEntriesInner

`func NewModGlossaryGetEntriesByAuthorId200ResponseEntriesInner() *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner`

NewModGlossaryGetEntriesByAuthorId200ResponseEntriesInner instantiates a new ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByAuthorId200ResponseEntriesInnerWithDefaults

`func NewModGlossaryGetEntriesByAuthorId200ResponseEntriesInnerWithDefaults() *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner`

NewModGlossaryGetEntriesByAuthorId200ResponseEntriesInnerWithDefaults instantiates a new ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApproved

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetApproved() bool`

GetApproved returns the Approved field if non-nil, zero value otherwise.

### GetApprovedOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetApprovedOk() (*bool, bool)`

GetApprovedOk returns a tuple with the Approved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproved

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetApproved(v bool)`

SetApproved sets Approved field to given value.

### HasApproved

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasApproved() bool`

HasApproved returns a boolean if a field has been set.

### GetAttachment

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetAttachment() bool`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetAttachmentOk() (*bool, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetAttachment(v bool)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachments

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetAttachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetCasesensitive

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetCasesensitive() bool`

GetCasesensitive returns the Casesensitive field if non-nil, zero value otherwise.

### GetCasesensitiveOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetCasesensitiveOk() (*bool, bool)`

GetCasesensitiveOk returns a tuple with the Casesensitive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCasesensitive

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetCasesensitive(v bool)`

SetCasesensitive sets Casesensitive field to given value.

### HasCasesensitive

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasCasesensitive() bool`

HasCasesensitive returns a boolean if a field has been set.

### GetConcept

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetConcept() string`

GetConcept returns the Concept field if non-nil, zero value otherwise.

### GetConceptOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetConceptOk() (*string, bool)`

GetConceptOk returns a tuple with the Concept field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConcept

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetConcept(v string)`

SetConcept sets Concept field to given value.

### HasConcept

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasConcept() bool`

HasConcept returns a boolean if a field has been set.

### GetDefinition

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetDefinition(v string)`

SetDefinition sets Definition field to given value.

### HasDefinition

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasDefinition() bool`

HasDefinition returns a boolean if a field has been set.

### GetDefinitionformat

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitionformat() int32`

GetDefinitionformat returns the Definitionformat field if non-nil, zero value otherwise.

### GetDefinitionformatOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitionformatOk() (*int32, bool)`

GetDefinitionformatOk returns a tuple with the Definitionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitionformat

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetDefinitionformat(v int32)`

SetDefinitionformat sets Definitionformat field to given value.

### HasDefinitionformat

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasDefinitionformat() bool`

HasDefinitionformat returns a boolean if a field has been set.

### GetDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitioninlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetDefinitioninlinefiles returns the Definitioninlinefiles field if non-nil, zero value otherwise.

### GetDefinitioninlinefilesOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitioninlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetDefinitioninlinefilesOk returns a tuple with the Definitioninlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetDefinitioninlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetDefinitioninlinefiles sets Definitioninlinefiles field to given value.

### HasDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasDefinitioninlinefiles() bool`

HasDefinitioninlinefiles returns a boolean if a field has been set.

### GetDefinitiontrust

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitiontrust() bool`

GetDefinitiontrust returns the Definitiontrust field if non-nil, zero value otherwise.

### GetDefinitiontrustOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetDefinitiontrustOk() (*bool, bool)`

GetDefinitiontrustOk returns a tuple with the Definitiontrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitiontrust

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetDefinitiontrust(v bool)`

SetDefinitiontrust sets Definitiontrust field to given value.

### HasDefinitiontrust

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasDefinitiontrust() bool`

HasDefinitiontrust returns a boolean if a field has been set.

### GetFullmatch

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetFullmatch() bool`

GetFullmatch returns the Fullmatch field if non-nil, zero value otherwise.

### GetFullmatchOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetFullmatchOk() (*bool, bool)`

GetFullmatchOk returns a tuple with the Fullmatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmatch

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetFullmatch(v bool)`

SetFullmatch sets Fullmatch field to given value.

### HasFullmatch

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasFullmatch() bool`

HasFullmatch returns a boolean if a field has been set.

### GetGlossaryid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetGlossaryid() int32`

GetGlossaryid returns the Glossaryid field if non-nil, zero value otherwise.

### GetGlossaryidOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetGlossaryidOk() (*int32, bool)`

GetGlossaryidOk returns a tuple with the Glossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlossaryid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetGlossaryid(v int32)`

SetGlossaryid sets Glossaryid field to given value.

### HasGlossaryid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasGlossaryid() bool`

HasGlossaryid returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetSourceglossaryid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetSourceglossaryid() int32`

GetSourceglossaryid returns the Sourceglossaryid field if non-nil, zero value otherwise.

### GetSourceglossaryidOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetSourceglossaryidOk() (*int32, bool)`

GetSourceglossaryidOk returns a tuple with the Sourceglossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceglossaryid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetSourceglossaryid(v int32)`

SetSourceglossaryid sets Sourceglossaryid field to given value.

### HasSourceglossaryid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasSourceglossaryid() bool`

HasSourceglossaryid returns a boolean if a field has been set.

### GetTags

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTeacherentry

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTeacherentry() bool`

GetTeacherentry returns the Teacherentry field if non-nil, zero value otherwise.

### GetTeacherentryOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTeacherentryOk() (*bool, bool)`

GetTeacherentryOk returns a tuple with the Teacherentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeacherentry

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetTeacherentry(v bool)`

SetTeacherentry sets Teacherentry field to given value.

### HasTeacherentry

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasTeacherentry() bool`

HasTeacherentry returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsedynalink

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUsedynalink() bool`

GetUsedynalink returns the Usedynalink field if non-nil, zero value otherwise.

### GetUsedynalinkOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUsedynalinkOk() (*bool, bool)`

GetUsedynalinkOk returns a tuple with the Usedynalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedynalink

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetUsedynalink(v bool)`

SetUsedynalink sets Usedynalink field to given value.

### HasUsedynalink

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasUsedynalink() bool`

HasUsedynalink returns a boolean if a field has been set.

### GetUserfullname

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUserpictureurl

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.

### HasUserpictureurl

`func (o *ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner) HasUserpictureurl() bool`

HasUserpictureurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


