# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_create_competency200_response import CoreCompetencyCreateCompetency200Response

class TestCoreCompetencyCreateCompetency200Response(unittest.TestCase):
    """CoreCompetencyCreateCompetency200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyCreateCompetency200Response:
        """Test CoreCompetencyCreateCompetency200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyCreateCompetency200Response`
        """
        model = CoreCompetencyCreateCompetency200Response()
        if include_optional:
            return CoreCompetencyCreateCompetency200Response(
                competencyframeworkid = 56,
                description = '',
                descriptionformat = 56,
                id = 56,
                idnumber = '',
                parentid = 56,
                path = '/0/',
                ruleconfig = '',
                ruleoutcome = 56,
                ruletype = '',
                scaleconfiguration = '',
                scaleid = 56,
                shortname = '',
                sortorder = 56,
                timecreated = 56,
                timemodified = 56,
                usermodified = 56
            )
        else:
            return CoreCompetencyCreateCompetency200Response(
                competencyframeworkid = 56,
                description = '',
                id = 56,
                idnumber = '',
                parentid = 56,
                path = '/0/',
                ruleconfig = '',
                ruleoutcome = 56,
                ruletype = '',
                scaleconfiguration = '',
                scaleid = 56,
                shortname = '',
                sortorder = 56,
                timecreated = 56,
                timemodified = 56,
                usermodified = 56,
        )
        """

    def testCoreCompetencyCreateCompetency200Response(self):
        """Test CoreCompetencyCreateCompetency200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()