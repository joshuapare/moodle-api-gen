# ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | Pointer to **bool** | canmanage | [optional] 
**Competencycount** | Pointer to **int32** | competencycount | [optional] 
**Description** | Pointer to **string** | description | [optional] [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Filecount** | Pointer to **int32** | filecount | [optional] 
**Files** | Pointer to [**[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner**](ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md) |  | [optional] 
**Hasurlorfiles** | Pointer to **bool** | hasurlorfiles | [optional] 
**Id** | Pointer to **int32** | id | [optional] [default to 0]
**Name** | Pointer to **string** | name | [optional] 
**Timecreated** | Pointer to **int32** | timecreated | [optional] [default to 0]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to 0]
**Url** | Pointer to **string** | url | [optional] [default to ""]
**Urlshort** | Pointer to **string** | urlshort | [optional] 
**Usercompetencies** | Pointer to [**[]ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner**](ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.md) |  | [optional] 
**Userhasplan** | Pointer to **bool** | userhasplan | [optional] [default to null]
**Userid** | Pointer to **int32** | userid | [optional] 
**Usermodified** | Pointer to **int32** | usermodified | [optional] [default to 0]

## Methods

### NewToolLpDataForUserEvidenceListPage200ResponseEvidenceInner

`func NewToolLpDataForUserEvidenceListPage200ResponseEvidenceInner() *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner`

NewToolLpDataForUserEvidenceListPage200ResponseEvidenceInner instantiates a new ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerWithDefaults

`func NewToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerWithDefaults() *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner`

NewToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerWithDefaults instantiates a new ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.

### HasCanmanage

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasCanmanage() bool`

HasCanmanage returns a boolean if a field has been set.

### GetCompetencycount

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetCompetencycount() int32`

GetCompetencycount returns the Competencycount field if non-nil, zero value otherwise.

### GetCompetencycountOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetCompetencycountOk() (*int32, bool)`

GetCompetencycountOk returns a tuple with the Competencycount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencycount

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetCompetencycount(v int32)`

SetCompetencycount sets Competencycount field to given value.

### HasCompetencycount

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasCompetencycount() bool`

HasCompetencycount returns a boolean if a field has been set.

### GetDescription

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetFilecount

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetFilecount() int32`

GetFilecount returns the Filecount field if non-nil, zero value otherwise.

### GetFilecountOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetFilecountOk() (*int32, bool)`

GetFilecountOk returns a tuple with the Filecount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilecount

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetFilecount(v int32)`

SetFilecount sets Filecount field to given value.

### HasFilecount

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasFilecount() bool`

HasFilecount returns a boolean if a field has been set.

### GetFiles

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetFiles() []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetFilesOk() (*[]ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetFiles(v []ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner)`

SetFiles sets Files field to given value.

### HasFiles

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasFiles() bool`

HasFiles returns a boolean if a field has been set.

### GetHasurlorfiles

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetHasurlorfiles() bool`

GetHasurlorfiles returns the Hasurlorfiles field if non-nil, zero value otherwise.

### GetHasurlorfilesOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetHasurlorfilesOk() (*bool, bool)`

GetHasurlorfilesOk returns a tuple with the Hasurlorfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasurlorfiles

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetHasurlorfiles(v bool)`

SetHasurlorfiles sets Hasurlorfiles field to given value.

### HasHasurlorfiles

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasHasurlorfiles() bool`

HasHasurlorfiles returns a boolean if a field has been set.

### GetId

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTimecreated

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetUrl

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUrlshort

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUrlshort() string`

GetUrlshort returns the Urlshort field if non-nil, zero value otherwise.

### GetUrlshortOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUrlshortOk() (*string, bool)`

GetUrlshortOk returns a tuple with the Urlshort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrlshort

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetUrlshort(v string)`

SetUrlshort sets Urlshort field to given value.

### HasUrlshort

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasUrlshort() bool`

HasUrlshort returns a boolean if a field has been set.

### GetUsercompetencies

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUsercompetencies() []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner`

GetUsercompetencies returns the Usercompetencies field if non-nil, zero value otherwise.

### GetUsercompetenciesOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUsercompetenciesOk() (*[]ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner, bool)`

GetUsercompetenciesOk returns a tuple with the Usercompetencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercompetencies

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetUsercompetencies(v []ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner)`

SetUsercompetencies sets Usercompetencies field to given value.

### HasUsercompetencies

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasUsercompetencies() bool`

HasUsercompetencies returns a boolean if a field has been set.

### GetUserhasplan

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUserhasplan() bool`

GetUserhasplan returns the Userhasplan field if non-nil, zero value otherwise.

### GetUserhasplanOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUserhasplanOk() (*bool, bool)`

GetUserhasplanOk returns a tuple with the Userhasplan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserhasplan

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetUserhasplan(v bool)`

SetUserhasplan sets Userhasplan field to given value.

### HasUserhasplan

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasUserhasplan() bool`

HasUserhasplan returns a boolean if a field has been set.

### GetUserid

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetUsermodified

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.

### HasUsermodified

`func (o *ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner) HasUsermodified() bool`

HasUsermodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


