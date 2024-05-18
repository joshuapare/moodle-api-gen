# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List
from openapi_client.models.core_competency_grade_competency200_response_actionuser import CoreCompetencyGradeCompetency200ResponseActionuser
from typing import Optional, Set
from typing_extensions import Self

class CoreReportbuilderRetrieveReport200ResponseDetails(BaseModel):
    """
    CoreReportbuilderRetrieveReport200ResponseDetails
    """ # noqa: E501
    area: StrictStr = Field(description="area")
    component: StrictStr = Field(description="component")
    conditiondata: StrictStr = Field(description="conditiondata")
    contextid: StrictInt = Field(description="contextid")
    id: StrictInt = Field(description="id")
    itemid: StrictInt = Field(description="itemid")
    modifiedby: CoreCompetencyGradeCompetency200ResponseActionuser
    name: StrictStr = Field(description="name")
    settingsdata: StrictStr = Field(description="settingsdata")
    source: StrictStr = Field(description="source")
    sourcename: StrictStr = Field(description="sourcename")
    timecreated: StrictInt = Field(description="timecreated")
    timemodified: StrictInt = Field(description="timemodified")
    type: StrictInt = Field(description="type")
    uniquerows: StrictBool = Field(description="uniquerows")
    usercreated: StrictInt = Field(description="usercreated")
    usermodified: StrictInt = Field(description="usermodified")
    __properties: ClassVar[List[str]] = ["area", "component", "conditiondata", "contextid", "id", "itemid", "modifiedby", "name", "settingsdata", "source", "sourcename", "timecreated", "timemodified", "type", "uniquerows", "usercreated", "usermodified"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreReportbuilderRetrieveReport200ResponseDetails from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of modifiedby
        if self.modifiedby:
            _dict['modifiedby'] = self.modifiedby.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreReportbuilderRetrieveReport200ResponseDetails from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "area": obj.get("area") if obj.get("area") is not None else '',
            "component": obj.get("component") if obj.get("component") is not None else '',
            "conditiondata": obj.get("conditiondata"),
            "contextid": obj.get("contextid") if obj.get("contextid") is not None else {},
            "id": obj.get("id") if obj.get("id") is not None else 0,
            "itemid": obj.get("itemid") if obj.get("itemid") is not None else 0,
            "modifiedby": CoreCompetencyGradeCompetency200ResponseActionuser.from_dict(obj["modifiedby"]) if obj.get("modifiedby") is not None else None,
            "name": obj.get("name"),
            "settingsdata": obj.get("settingsdata"),
            "source": obj.get("source"),
            "sourcename": obj.get("sourcename"),
            "timecreated": obj.get("timecreated") if obj.get("timecreated") is not None else 0,
            "timemodified": obj.get("timemodified") if obj.get("timemodified") is not None else 0,
            "type": obj.get("type"),
            "uniquerows": obj.get("uniquerows") if obj.get("uniquerows") is not None else False,
            "usercreated": obj.get("usercreated") if obj.get("usercreated") is not None else {},
            "usermodified": obj.get("usermodified") if obj.get("usermodified") is not None else 0
        })
        return _obj

