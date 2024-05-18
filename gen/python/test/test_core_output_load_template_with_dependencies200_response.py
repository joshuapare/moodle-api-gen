# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_output_load_template_with_dependencies200_response import CoreOutputLoadTemplateWithDependencies200Response

class TestCoreOutputLoadTemplateWithDependencies200Response(unittest.TestCase):
    """CoreOutputLoadTemplateWithDependencies200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreOutputLoadTemplateWithDependencies200Response:
        """Test CoreOutputLoadTemplateWithDependencies200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreOutputLoadTemplateWithDependencies200Response`
        """
        model = CoreOutputLoadTemplateWithDependencies200Response()
        if include_optional:
            return CoreOutputLoadTemplateWithDependencies200Response(
                strings = [
                    openapi_client.models.core_output_load_template_with_dependencies_200_response_strings_inner.core_output_load_template_with_dependencies_200_response_strings_inner(
                        component = 'null', 
                        name = 'null', 
                        value = 'null', )
                    ],
                templates = [
                    openapi_client.models.core_output_load_template_with_dependencies_200_response_templates_inner.core_output_load_template_with_dependencies_200_response_templates_inner(
                        component = '', 
                        name = '', 
                        value = '', )
                    ]
            )
        else:
            return CoreOutputLoadTemplateWithDependencies200Response(
                strings = [
                    openapi_client.models.core_output_load_template_with_dependencies_200_response_strings_inner.core_output_load_template_with_dependencies_200_response_strings_inner(
                        component = 'null', 
                        name = 'null', 
                        value = 'null', )
                    ],
                templates = [
                    openapi_client.models.core_output_load_template_with_dependencies_200_response_templates_inner.core_output_load_template_with_dependencies_200_response_templates_inner(
                        component = '', 
                        name = '', 
                        value = '', )
                    ],
        )
        """

    def testCoreOutputLoadTemplateWithDependencies200Response(self):
        """Test CoreOutputLoadTemplateWithDependencies200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()