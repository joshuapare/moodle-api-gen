# ModGlossaryGetEntryById200ResponseEntry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | **bool** | Whether the entry was approved | 
**Attachment** | **bool** | Whether or not the entry has attachments | 
**Attachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Casesensitive** | **bool** | When true, the matching is case sensitive | 
**Concept** | **string** | The concept | 
**Definition** | **string** | The definition | 
**Definitionformat** | **int32** | definition format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**Definitioninlinefiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Definitiontrust** | **bool** | The definition trust flag | 
**Fullmatch** | **bool** | When true, the matching is done on full words only | 
**Glossaryid** | **int32** | The glossary ID | 
**Id** | **int32** | The entry ID | 
**Sourceglossaryid** | **int32** | The source glossary ID | 
**Tags** | Pointer to [**[]ModDataGetEntries200ResponseEntriesInnerTagsInner**](ModDataGetEntries200ResponseEntriesInnerTagsInner.md) |  | [optional] 
**Teacherentry** | **bool** | The entry was created by a teacher, or equivalent. | 
**Timecreated** | **int32** | Time created | 
**Timemodified** | **int32** | Time modified | 
**Usedynalink** | **bool** | Whether the concept should be automatically linked | 
**Userfullname** | **string** | Author full name | 
**Userid** | **int32** | Author ID | 
**Userpictureurl** | **string** | Author picture | 

## Methods

### NewModGlossaryGetEntryById200ResponseEntry

`func NewModGlossaryGetEntryById200ResponseEntry(approved bool, attachment bool, casesensitive bool, concept string, definition string, definitionformat int32, definitiontrust bool, fullmatch bool, glossaryid int32, id int32, sourceglossaryid int32, teacherentry bool, timecreated int32, timemodified int32, usedynalink bool, userfullname string, userid int32, userpictureurl string, ) *ModGlossaryGetEntryById200ResponseEntry`

NewModGlossaryGetEntryById200ResponseEntry instantiates a new ModGlossaryGetEntryById200ResponseEntry object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntryById200ResponseEntryWithDefaults

`func NewModGlossaryGetEntryById200ResponseEntryWithDefaults() *ModGlossaryGetEntryById200ResponseEntry`

NewModGlossaryGetEntryById200ResponseEntryWithDefaults instantiates a new ModGlossaryGetEntryById200ResponseEntry object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApproved

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetApproved() bool`

GetApproved returns the Approved field if non-nil, zero value otherwise.

### GetApprovedOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetApprovedOk() (*bool, bool)`

GetApprovedOk returns a tuple with the Approved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproved

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetApproved(v bool)`

SetApproved sets Approved field to given value.


### GetAttachment

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetAttachment() bool`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetAttachmentOk() (*bool, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetAttachment(v bool)`

SetAttachment sets Attachment field to given value.


### GetAttachments

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetAttachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModGlossaryGetEntryById200ResponseEntry) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetCasesensitive

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetCasesensitive() bool`

GetCasesensitive returns the Casesensitive field if non-nil, zero value otherwise.

### GetCasesensitiveOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetCasesensitiveOk() (*bool, bool)`

GetCasesensitiveOk returns a tuple with the Casesensitive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCasesensitive

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetCasesensitive(v bool)`

SetCasesensitive sets Casesensitive field to given value.


### GetConcept

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetConcept() string`

GetConcept returns the Concept field if non-nil, zero value otherwise.

### GetConceptOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetConceptOk() (*string, bool)`

GetConceptOk returns a tuple with the Concept field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConcept

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetConcept(v string)`

SetConcept sets Concept field to given value.


### GetDefinition

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetDefinition(v string)`

SetDefinition sets Definition field to given value.


### GetDefinitionformat

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitionformat() int32`

GetDefinitionformat returns the Definitionformat field if non-nil, zero value otherwise.

### GetDefinitionformatOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitionformatOk() (*int32, bool)`

GetDefinitionformatOk returns a tuple with the Definitionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitionformat

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetDefinitionformat(v int32)`

SetDefinitionformat sets Definitionformat field to given value.


### GetDefinitioninlinefiles

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitioninlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetDefinitioninlinefiles returns the Definitioninlinefiles field if non-nil, zero value otherwise.

### GetDefinitioninlinefilesOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitioninlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetDefinitioninlinefilesOk returns a tuple with the Definitioninlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitioninlinefiles

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetDefinitioninlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetDefinitioninlinefiles sets Definitioninlinefiles field to given value.

### HasDefinitioninlinefiles

`func (o *ModGlossaryGetEntryById200ResponseEntry) HasDefinitioninlinefiles() bool`

HasDefinitioninlinefiles returns a boolean if a field has been set.

### GetDefinitiontrust

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitiontrust() bool`

GetDefinitiontrust returns the Definitiontrust field if non-nil, zero value otherwise.

### GetDefinitiontrustOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetDefinitiontrustOk() (*bool, bool)`

GetDefinitiontrustOk returns a tuple with the Definitiontrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitiontrust

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetDefinitiontrust(v bool)`

SetDefinitiontrust sets Definitiontrust field to given value.


### GetFullmatch

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetFullmatch() bool`

GetFullmatch returns the Fullmatch field if non-nil, zero value otherwise.

### GetFullmatchOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetFullmatchOk() (*bool, bool)`

GetFullmatchOk returns a tuple with the Fullmatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmatch

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetFullmatch(v bool)`

SetFullmatch sets Fullmatch field to given value.


### GetGlossaryid

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetGlossaryid() int32`

GetGlossaryid returns the Glossaryid field if non-nil, zero value otherwise.

### GetGlossaryidOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetGlossaryidOk() (*int32, bool)`

GetGlossaryidOk returns a tuple with the Glossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlossaryid

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetGlossaryid(v int32)`

SetGlossaryid sets Glossaryid field to given value.


### GetId

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetId(v int32)`

SetId sets Id field to given value.


### GetSourceglossaryid

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetSourceglossaryid() int32`

GetSourceglossaryid returns the Sourceglossaryid field if non-nil, zero value otherwise.

### GetSourceglossaryidOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetSourceglossaryidOk() (*int32, bool)`

GetSourceglossaryidOk returns a tuple with the Sourceglossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceglossaryid

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetSourceglossaryid(v int32)`

SetSourceglossaryid sets Sourceglossaryid field to given value.


### GetTags

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModGlossaryGetEntryById200ResponseEntry) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTeacherentry

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTeacherentry() bool`

GetTeacherentry returns the Teacherentry field if non-nil, zero value otherwise.

### GetTeacherentryOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTeacherentryOk() (*bool, bool)`

GetTeacherentryOk returns a tuple with the Teacherentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeacherentry

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetTeacherentry(v bool)`

SetTeacherentry sets Teacherentry field to given value.


### GetTimecreated

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsedynalink

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUsedynalink() bool`

GetUsedynalink returns the Usedynalink field if non-nil, zero value otherwise.

### GetUsedynalinkOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUsedynalinkOk() (*bool, bool)`

GetUsedynalinkOk returns a tuple with the Usedynalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedynalink

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetUsedynalink(v bool)`

SetUsedynalink sets Usedynalink field to given value.


### GetUserfullname

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.


### GetUserid

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUserpictureurl

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *ModGlossaryGetEntryById200ResponseEntry) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *ModGlossaryGetEntryById200ResponseEntry) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


