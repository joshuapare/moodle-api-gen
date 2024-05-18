/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing ModLtiApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ModLtiApiTests : IDisposable
    {
        private ModLtiApi instance;

        public ModLtiApiTests()
        {
            instance = new ModLtiApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ModLtiApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ModLtiApi
            //Assert.IsType<ModLtiApi>(instance);
        }

        /// <summary>
        /// Test ModLtiCreateToolProxy
        /// </summary>
        [Fact]
        public void ModLtiCreateToolProxyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiCreateToolProxyRequest modLtiCreateToolProxyRequest = null;
            //var response = instance.ModLtiCreateToolProxy(modLtiCreateToolProxyRequest);
            //Assert.IsType<ModLtiCreateToolProxy200Response>(response);
        }

        /// <summary>
        /// Test ModLtiCreateToolType
        /// </summary>
        [Fact]
        public void ModLtiCreateToolTypeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiCreateToolTypeRequest modLtiCreateToolTypeRequest = null;
            //var response = instance.ModLtiCreateToolType(modLtiCreateToolTypeRequest);
            //Assert.IsType<ModLtiCreateToolType200Response>(response);
        }

        /// <summary>
        /// Test ModLtiDeleteCourseToolType
        /// </summary>
        [Fact]
        public void ModLtiDeleteCourseToolTypeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiDeleteCourseToolTypeRequest modLtiDeleteCourseToolTypeRequest = null;
            //var response = instance.ModLtiDeleteCourseToolType(modLtiDeleteCourseToolTypeRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test ModLtiDeleteToolProxy
        /// </summary>
        [Fact]
        public void ModLtiDeleteToolProxyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiDeleteToolProxyRequest modLtiDeleteToolProxyRequest = null;
            //var response = instance.ModLtiDeleteToolProxy(modLtiDeleteToolProxyRequest);
            //Assert.IsType<ModLtiDeleteToolProxy200Response>(response);
        }

        /// <summary>
        /// Test ModLtiDeleteToolType
        /// </summary>
        [Fact]
        public void ModLtiDeleteToolTypeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiDeleteToolTypeRequest modLtiDeleteToolTypeRequest = null;
            //var response = instance.ModLtiDeleteToolType(modLtiDeleteToolTypeRequest);
            //Assert.IsType<ModLtiDeleteToolTypeRequest>(response);
        }

        /// <summary>
        /// Test ModLtiGetLtisByCourses
        /// </summary>
        [Fact]
        public void ModLtiGetLtisByCoursesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = null;
            //var response = instance.ModLtiGetLtisByCourses(modChatGetChatsByCoursesRequest);
            //Assert.IsType<ModLtiGetLtisByCourses200Response>(response);
        }

        /// <summary>
        /// Test ModLtiGetToolLaunchData
        /// </summary>
        [Fact]
        public void ModLtiGetToolLaunchDataTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiGetToolLaunchDataRequest modLtiGetToolLaunchDataRequest = null;
            //var response = instance.ModLtiGetToolLaunchData(modLtiGetToolLaunchDataRequest);
            //Assert.IsType<ModLtiGetToolLaunchData200Response>(response);
        }

        /// <summary>
        /// Test ModLtiGetToolProxies
        /// </summary>
        [Fact]
        public void ModLtiGetToolProxiesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiGetToolProxiesRequest modLtiGetToolProxiesRequest = null;
            //var response = instance.ModLtiGetToolProxies(modLtiGetToolProxiesRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test ModLtiGetToolProxyRegistrationRequest
        /// </summary>
        [Fact]
        public void ModLtiGetToolProxyRegistrationRequestTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiDeleteToolProxyRequest modLtiDeleteToolProxyRequest = null;
            //var response = instance.ModLtiGetToolProxyRegistrationRequest(modLtiDeleteToolProxyRequest);
            //Assert.IsType<ModLtiGetToolProxyRegistrationRequest200Response>(response);
        }

        /// <summary>
        /// Test ModLtiGetToolTypes
        /// </summary>
        [Fact]
        public void ModLtiGetToolTypesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiGetToolTypesRequest modLtiGetToolTypesRequest = null;
            //var response = instance.ModLtiGetToolTypes(modLtiGetToolTypesRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test ModLtiGetToolTypesAndProxies
        /// </summary>
        [Fact]
        public void ModLtiGetToolTypesAndProxiesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiGetToolTypesAndProxiesRequest modLtiGetToolTypesAndProxiesRequest = null;
            //var response = instance.ModLtiGetToolTypesAndProxies(modLtiGetToolTypesAndProxiesRequest);
            //Assert.IsType<ModLtiGetToolTypesAndProxies200Response>(response);
        }

        /// <summary>
        /// Test ModLtiGetToolTypesAndProxiesCount
        /// </summary>
        [Fact]
        public void ModLtiGetToolTypesAndProxiesCountTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiGetToolTypesAndProxiesCountRequest modLtiGetToolTypesAndProxiesCountRequest = null;
            //var response = instance.ModLtiGetToolTypesAndProxiesCount(modLtiGetToolTypesAndProxiesCountRequest);
            //Assert.IsType<ModLtiGetToolTypesAndProxiesCount200Response>(response);
        }

        /// <summary>
        /// Test ModLtiIsCartridge
        /// </summary>
        [Fact]
        public void ModLtiIsCartridgeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiIsCartridgeRequest modLtiIsCartridgeRequest = null;
            //var response = instance.ModLtiIsCartridge(modLtiIsCartridgeRequest);
            //Assert.IsType<ModLtiIsCartridge200Response>(response);
        }

        /// <summary>
        /// Test ModLtiToggleShowinactivitychooser
        /// </summary>
        [Fact]
        public void ModLtiToggleShowinactivitychooserTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiToggleShowinactivitychooserRequest modLtiToggleShowinactivitychooserRequest = null;
            //var response = instance.ModLtiToggleShowinactivitychooser(modLtiToggleShowinactivitychooserRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test ModLtiUpdateToolType
        /// </summary>
        [Fact]
        public void ModLtiUpdateToolTypeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiUpdateToolTypeRequest modLtiUpdateToolTypeRequest = null;
            //var response = instance.ModLtiUpdateToolType(modLtiUpdateToolTypeRequest);
            //Assert.IsType<ModLtiUpdateToolType200Response>(response);
        }

        /// <summary>
        /// Test ModLtiViewLti
        /// </summary>
        [Fact]
        public void ModLtiViewLtiTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModLtiViewLtiRequest modLtiViewLtiRequest = null;
            //var response = instance.ModLtiViewLti(modLtiViewLtiRequest);
            //Assert.IsType<CoreCalendarDeleteSubscription200Response>(response);
        }
    }
}
