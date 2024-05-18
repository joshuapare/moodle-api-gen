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
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response_competencies_inner import ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response_settings import ToolLpDataForCourseCompetenciesPage200ResponseSettings
from openapi_client.models.tool_lp_data_for_course_competencies_page200_response_statistics import ToolLpDataForCourseCompetenciesPage200ResponseStatistics
from typing import Optional, Set
from typing_extensions import Self

class ToolLpDataForCourseCompetenciesPage200Response(BaseModel):
    """
    ToolLpDataForCourseCompetenciesPage200Response
    """ # noqa: E501
    canconfigurecoursecompetencies: StrictBool = Field(description="User can configure course competency settings")
    cangradecompetencies: StrictBool = Field(description="User can grade competencies.")
    canmanagecompetencyframeworks: StrictBool = Field(description="User can manage competency frameworks")
    canmanagecoursecompetencies: StrictBool = Field(description="User can manage linked course competencies")
    competencies: List[ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner]
    courseid: StrictInt = Field(description="The current course id")
    gradableuserid: Optional[StrictInt] = Field(default=null, description="Current user id, if the user is a gradable user.")
    manageurl: StrictStr = Field(description="Url to the manage competencies page.")
    pagecontextid: StrictInt = Field(description="The current page context ID.")
    pluginbaseurl: StrictStr = Field(description="Url to the course competencies page.")
    settings: ToolLpDataForCourseCompetenciesPage200ResponseSettings
    statistics: ToolLpDataForCourseCompetenciesPage200ResponseStatistics
    __properties: ClassVar[List[str]] = ["canconfigurecoursecompetencies", "cangradecompetencies", "canmanagecompetencyframeworks", "canmanagecoursecompetencies", "competencies", "courseid", "gradableuserid", "manageurl", "pagecontextid", "pluginbaseurl", "settings", "statistics"]

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
        """Create an instance of ToolLpDataForCourseCompetenciesPage200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in competencies (list)
        _items = []
        if self.competencies:
            for _item in self.competencies:
                if _item:
                    _items.append(_item.to_dict())
            _dict['competencies'] = _items
        # override the default output from pydantic by calling `to_dict()` of settings
        if self.settings:
            _dict['settings'] = self.settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of statistics
        if self.statistics:
            _dict['statistics'] = self.statistics.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ToolLpDataForCourseCompetenciesPage200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "canconfigurecoursecompetencies": obj.get("canconfigurecoursecompetencies") if obj.get("canconfigurecoursecompetencies") is not None else False,
            "cangradecompetencies": obj.get("cangradecompetencies") if obj.get("cangradecompetencies") is not None else False,
            "canmanagecompetencyframeworks": obj.get("canmanagecompetencyframeworks") if obj.get("canmanagecompetencyframeworks") is not None else False,
            "canmanagecoursecompetencies": obj.get("canmanagecoursecompetencies") if obj.get("canmanagecoursecompetencies") is not None else False,
            "competencies": [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.from_dict(_item) for _item in obj["competencies"]] if obj.get("competencies") is not None else None,
            "courseid": obj.get("courseid") if obj.get("courseid") is not None else null,
            "gradableuserid": obj.get("gradableuserid") if obj.get("gradableuserid") is not None else null,
            "manageurl": obj.get("manageurl") if obj.get("manageurl") is not None else 'null',
            "pagecontextid": obj.get("pagecontextid") if obj.get("pagecontextid") is not None else null,
            "pluginbaseurl": obj.get("pluginbaseurl") if obj.get("pluginbaseurl") is not None else 'null',
            "settings": ToolLpDataForCourseCompetenciesPage200ResponseSettings.from_dict(obj["settings"]) if obj.get("settings") is not None else None,
            "statistics": ToolLpDataForCourseCompetenciesPage200ResponseStatistics.from_dict(obj["statistics"]) if obj.get("statistics") is not None else None
        })
        return _obj

