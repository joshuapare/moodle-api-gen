# ToolLpDataForUserEvidencePage200ResponseUserevidence

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | canmanage | 
**Competencycount** | **int32** | competencycount | 
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Filecount** | **int32** | filecount | 
**Files** | [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | 
**Hasurlorfiles** | **bool** | hasurlorfiles | 
**Id** | **int32** | id | [default to 0]
**Name** | **string** | name | 
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Url** | **string** | url | [default to ""]
**Urlshort** | **string** | urlshort | 
**Usercompetencies** | Pointer to [**[]ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner**](ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.md) |  | [optional] 
**Userhasplan** | **bool** | userhasplan | 
**Userid** | **int32** | userid | 
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewToolLpDataForUserEvidencePage200ResponseUserevidence

`func NewToolLpDataForUserEvidencePage200ResponseUserevidence(canmanage bool, competencycount int32, description string, filecount int32, files []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, hasurlorfiles bool, id int32, name string, timecreated int32, timemodified int32, url string, urlshort string, userhasplan bool, userid int32, usermodified int32, ) *ToolLpDataForUserEvidencePage200ResponseUserevidence`

NewToolLpDataForUserEvidencePage200ResponseUserevidence instantiates a new ToolLpDataForUserEvidencePage200ResponseUserevidence object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForUserEvidencePage200ResponseUserevidenceWithDefaults

`func NewToolLpDataForUserEvidencePage200ResponseUserevidenceWithDefaults() *ToolLpDataForUserEvidencePage200ResponseUserevidence`

NewToolLpDataForUserEvidencePage200ResponseUserevidenceWithDefaults instantiates a new ToolLpDataForUserEvidencePage200ResponseUserevidence object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCompetencycount

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetCompetencycount() int32`

GetCompetencycount returns the Competencycount field if non-nil, zero value otherwise.

### GetCompetencycountOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetCompetencycountOk() (*int32, bool)`

GetCompetencycountOk returns a tuple with the Competencycount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencycount

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetCompetencycount(v int32)`

SetCompetencycount sets Competencycount field to given value.


### GetDescription

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetFilecount

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetFilecount() int32`

GetFilecount returns the Filecount field if non-nil, zero value otherwise.

### GetFilecountOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetFilecountOk() (*int32, bool)`

GetFilecountOk returns a tuple with the Filecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilecount

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetFilecount(v int32)`

SetFilecount sets Filecount field to given value.


### GetFiles

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetFiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetFilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetFiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetFiles sets Files field to given value.


### GetHasurlorfiles

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetHasurlorfiles() bool`

GetHasurlorfiles returns the Hasurlorfiles field if non-nil, zero value otherwise.

### GetHasurlorfilesOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetHasurlorfilesOk() (*bool, bool)`

GetHasurlorfilesOk returns a tuple with the Hasurlorfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasurlorfiles

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetHasurlorfiles(v bool)`

SetHasurlorfiles sets Hasurlorfiles field to given value.


### GetId

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetName(v string)`

SetName sets Name field to given value.


### GetTimecreated

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUrl

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUrlshort

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUrlshort() string`

GetUrlshort returns the Urlshort field if non-nil, zero value otherwise.

### GetUrlshortOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUrlshortOk() (*string, bool)`

GetUrlshortOk returns a tuple with the Urlshort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlshort

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetUrlshort(v string)`

SetUrlshort sets Urlshort field to given value.


### GetUsercompetencies

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUsercompetencies() []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner`

GetUsercompetencies returns the Usercompetencies field if non-nil, zero value otherwise.

### GetUsercompetenciesOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUsercompetenciesOk() (*[]ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner, bool)`

GetUsercompetenciesOk returns a tuple with the Usercompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetencies

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetUsercompetencies(v []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner)`

SetUsercompetencies sets Usercompetencies field to given value.

### HasUsercompetencies

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) HasUsercompetencies() bool`

HasUsercompetencies returns a boolean if a field has been set.

### GetUserhasplan

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUserhasplan() bool`

GetUserhasplan returns the Userhasplan field if non-nil, zero value otherwise.

### GetUserhasplanOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUserhasplanOk() (*bool, bool)`

GetUserhasplanOk returns a tuple with the Userhasplan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserhasplan

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetUserhasplan(v bool)`

SetUserhasplan sets Userhasplan field to given value.


### GetUserid

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetUsermodified

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ToolLpDataForUserEvidencePage200ResponseUserevidence) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


