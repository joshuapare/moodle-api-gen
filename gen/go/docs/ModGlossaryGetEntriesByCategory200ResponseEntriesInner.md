# ModGlossaryGetEntriesByCategory200ResponseEntriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Approved** | Pointer to **bool** | Whether the entry was approved | [optional] 
**Attachment** | Pointer to **bool** | Whether or not the entry has attachments | [optional] 
**Attachments** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Casesensitive** | Pointer to **bool** | When true, the matching is case sensitive | [optional] 
**Categoryid** | Pointer to **int32** | The category ID. This may be &#39;-1&#39; when the entry is not categorised | [optional] [default to -1]
**Categoryname** | Pointer to **string** | The category name. May be empty when the entry is not categorised, or the request was limited to one category. | [optional] [default to ""]
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

### NewModGlossaryGetEntriesByCategory200ResponseEntriesInner

`func NewModGlossaryGetEntriesByCategory200ResponseEntriesInner() *ModGlossaryGetEntriesByCategory200ResponseEntriesInner`

NewModGlossaryGetEntriesByCategory200ResponseEntriesInner instantiates a new ModGlossaryGetEntriesByCategory200ResponseEntriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModGlossaryGetEntriesByCategory200ResponseEntriesInnerWithDefaults

`func NewModGlossaryGetEntriesByCategory200ResponseEntriesInnerWithDefaults() *ModGlossaryGetEntriesByCategory200ResponseEntriesInner`

NewModGlossaryGetEntriesByCategory200ResponseEntriesInnerWithDefaults instantiates a new ModGlossaryGetEntriesByCategory200ResponseEntriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetApproved

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetApproved() bool`

GetApproved returns the Approved field if non-nil, zero value otherwise.

### GetApprovedOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetApprovedOk() (*bool, bool)`

GetApprovedOk returns a tuple with the Approved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApproved

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetApproved(v bool)`

SetApproved sets Approved field to given value.

### HasApproved

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasApproved() bool`

HasApproved returns a boolean if a field has been set.

### GetAttachment

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachment() bool`

GetAttachment returns the Attachment field if non-nil, zero value otherwise.

### GetAttachmentOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachmentOk() (*bool, bool)`

GetAttachmentOk returns a tuple with the Attachment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachment

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetAttachment(v bool)`

SetAttachment sets Attachment field to given value.

### HasAttachment

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasAttachment() bool`

HasAttachment returns a boolean if a field has been set.

### GetAttachments

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachments() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetAttachmentsOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetAttachments(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetCasesensitive

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCasesensitive() bool`

GetCasesensitive returns the Casesensitive field if non-nil, zero value otherwise.

### GetCasesensitiveOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCasesensitiveOk() (*bool, bool)`

GetCasesensitiveOk returns a tuple with the Casesensitive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCasesensitive

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetCasesensitive(v bool)`

SetCasesensitive sets Casesensitive field to given value.

### HasCasesensitive

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasCasesensitive() bool`

HasCasesensitive returns a boolean if a field has been set.

### GetCategoryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCategoryname

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategoryname() string`

GetCategoryname returns the Categoryname field if non-nil, zero value otherwise.

### GetCategorynameOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetCategorynameOk() (*string, bool)`

GetCategorynameOk returns a tuple with the Categoryname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryname

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetCategoryname(v string)`

SetCategoryname sets Categoryname field to given value.

### HasCategoryname

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasCategoryname() bool`

HasCategoryname returns a boolean if a field has been set.

### GetConcept

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetConcept() string`

GetConcept returns the Concept field if non-nil, zero value otherwise.

### GetConceptOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetConceptOk() (*string, bool)`

GetConceptOk returns a tuple with the Concept field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConcept

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetConcept(v string)`

SetConcept sets Concept field to given value.

### HasConcept

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasConcept() bool`

HasConcept returns a boolean if a field has been set.

### GetDefinition

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinition(v string)`

SetDefinition sets Definition field to given value.

### HasDefinition

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinition() bool`

HasDefinition returns a boolean if a field has been set.

### GetDefinitionformat

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitionformat() int32`

GetDefinitionformat returns the Definitionformat field if non-nil, zero value otherwise.

### GetDefinitionformatOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitionformatOk() (*int32, bool)`

GetDefinitionformatOk returns a tuple with the Definitionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitionformat

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinitionformat(v int32)`

SetDefinitionformat sets Definitionformat field to given value.

### HasDefinitionformat

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinitionformat() bool`

HasDefinitionformat returns a boolean if a field has been set.

### GetDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitioninlinefiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetDefinitioninlinefiles returns the Definitioninlinefiles field if non-nil, zero value otherwise.

### GetDefinitioninlinefilesOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitioninlinefilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetDefinitioninlinefilesOk returns a tuple with the Definitioninlinefiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinitioninlinefiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetDefinitioninlinefiles sets Definitioninlinefiles field to given value.

### HasDefinitioninlinefiles

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinitioninlinefiles() bool`

HasDefinitioninlinefiles returns a boolean if a field has been set.

### GetDefinitiontrust

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitiontrust() bool`

GetDefinitiontrust returns the Definitiontrust field if non-nil, zero value otherwise.

### GetDefinitiontrustOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetDefinitiontrustOk() (*bool, bool)`

GetDefinitiontrustOk returns a tuple with the Definitiontrust field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinitiontrust

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetDefinitiontrust(v bool)`

SetDefinitiontrust sets Definitiontrust field to given value.

### HasDefinitiontrust

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasDefinitiontrust() bool`

HasDefinitiontrust returns a boolean if a field has been set.

### GetFullmatch

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetFullmatch() bool`

GetFullmatch returns the Fullmatch field if non-nil, zero value otherwise.

### GetFullmatchOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetFullmatchOk() (*bool, bool)`

GetFullmatchOk returns a tuple with the Fullmatch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullmatch

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetFullmatch(v bool)`

SetFullmatch sets Fullmatch field to given value.

### HasFullmatch

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasFullmatch() bool`

HasFullmatch returns a boolean if a field has been set.

### GetGlossaryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetGlossaryid() int32`

GetGlossaryid returns the Glossaryid field if non-nil, zero value otherwise.

### GetGlossaryidOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetGlossaryidOk() (*int32, bool)`

GetGlossaryidOk returns a tuple with the Glossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlossaryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetGlossaryid(v int32)`

SetGlossaryid sets Glossaryid field to given value.

### HasGlossaryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasGlossaryid() bool`

HasGlossaryid returns a boolean if a field has been set.

### GetId

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetSourceglossaryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetSourceglossaryid() int32`

GetSourceglossaryid returns the Sourceglossaryid field if non-nil, zero value otherwise.

### GetSourceglossaryidOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetSourceglossaryidOk() (*int32, bool)`

GetSourceglossaryidOk returns a tuple with the Sourceglossaryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceglossaryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetSourceglossaryid(v int32)`

SetSourceglossaryid sets Sourceglossaryid field to given value.

### HasSourceglossaryid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasSourceglossaryid() bool`

HasSourceglossaryid returns a boolean if a field has been set.

### GetTags

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTags() []ModDataGetEntries200ResponseEntriesInnerTagsInner`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTagsOk() (*[]ModDataGetEntries200ResponseEntriesInnerTagsInner, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTags(v []ModDataGetEntries200ResponseEntriesInnerTagsInner)`

SetTags sets Tags field to given value.

### HasTags

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTeacherentry

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTeacherentry() bool`

GetTeacherentry returns the Teacherentry field if non-nil, zero value otherwise.

### GetTeacherentryOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTeacherentryOk() (*bool, bool)`

GetTeacherentryOk returns a tuple with the Teacherentry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeacherentry

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTeacherentry(v bool)`

SetTeacherentry sets Teacherentry field to given value.

### HasTeacherentry

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTeacherentry() bool`

HasTeacherentry returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUsedynalink

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUsedynalink() bool`

GetUsedynalink returns the Usedynalink field if non-nil, zero value otherwise.

### GetUsedynalinkOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUsedynalinkOk() (*bool, bool)`

GetUsedynalinkOk returns a tuple with the Usedynalink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedynalink

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUsedynalink(v bool)`

SetUsedynalink sets Usedynalink field to given value.

### HasUsedynalink

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUsedynalink() bool`

HasUsedynalink returns a boolean if a field has been set.

### GetUserfullname

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserfullname() string`

GetUserfullname returns the Userfullname field if non-nil, zero value otherwise.

### GetUserfullnameOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserfullnameOk() (*string, bool)`

GetUserfullnameOk returns a tuple with the Userfullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserfullname

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUserfullname(v string)`

SetUserfullname sets Userfullname field to given value.

### HasUserfullname

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUserfullname() bool`

HasUserfullname returns a boolean if a field has been set.

### GetUserid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUserpictureurl

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserpictureurl() string`

GetUserpictureurl returns the Userpictureurl field if non-nil, zero value otherwise.

### GetUserpictureurlOk

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) GetUserpictureurlOk() (*string, bool)`

GetUserpictureurlOk returns a tuple with the Userpictureurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserpictureurl

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) SetUserpictureurl(v string)`

SetUserpictureurl sets Userpictureurl field to given value.

### HasUserpictureurl

`func (o *ModGlossaryGetEntriesByCategory200ResponseEntriesInner) HasUserpictureurl() bool`

HasUserpictureurl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


