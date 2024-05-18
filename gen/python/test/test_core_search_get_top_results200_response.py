# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_search_get_top_results200_response import CoreSearchGetTopResults200Response

class TestCoreSearchGetTopResults200Response(unittest.TestCase):
    """CoreSearchGetTopResults200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreSearchGetTopResults200Response:
        """Test CoreSearchGetTopResults200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreSearchGetTopResults200Response`
        """
        model = CoreSearchGetTopResults200Response()
        if include_optional:
            return CoreSearchGetTopResults200Response(
                results = [
                    openapi_client.models.core_search_get_top_results_200_response_results_inner.core_search_get_top_results_200_response_results_inner(
                        areaname = '', 
                        componentname = '', 
                        content = '', 
                        contextid = 56, 
                        contexturl = '', 
                        coursefullname = '', 
                        courseurl = '', 
                        description1 = '', 
                        description2 = '', 
                        docurl = '', 
                        filename = '', 
                        filenames = '', 
                        iconurl = '', 
                        itemid = 56, 
                        multiplefiles = 56, 
                        textformat = 56, 
                        timemodified = 56, 
                        title = '', 
                        userfullname = '', 
                        userid = 56, 
                        userurl = '', )
                    ]
            )
        else:
            return CoreSearchGetTopResults200Response(
                results = [
                    openapi_client.models.core_search_get_top_results_200_response_results_inner.core_search_get_top_results_200_response_results_inner(
                        areaname = '', 
                        componentname = '', 
                        content = '', 
                        contextid = 56, 
                        contexturl = '', 
                        coursefullname = '', 
                        courseurl = '', 
                        description1 = '', 
                        description2 = '', 
                        docurl = '', 
                        filename = '', 
                        filenames = '', 
                        iconurl = '', 
                        itemid = 56, 
                        multiplefiles = 56, 
                        textformat = 56, 
                        timemodified = 56, 
                        title = '', 
                        userfullname = '', 
                        userid = 56, 
                        userurl = '', )
                    ],
        )
        """

    def testCoreSearchGetTopResults200Response(self):
        """Test CoreSearchGetTopResults200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
