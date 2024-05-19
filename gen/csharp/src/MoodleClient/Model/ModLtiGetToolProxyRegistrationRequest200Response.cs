/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModLtiGetToolProxyRegistrationRequest200Response
    /// </summary>
    [DataContract(Name = "mod_lti_get_tool_proxy_registration_request_200_response")]
    public partial class ModLtiGetToolProxyRegistrationRequest200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiGetToolProxyRegistrationRequest200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLtiGetToolProxyRegistrationRequest200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiGetToolProxyRegistrationRequest200Response" /> class.
        /// </summary>
        /// <param name="launchPresentationReturnUrl">URL to redirect on registration completion (required) (default to &quot;null&quot;).</param>
        /// <param name="ltiMessageType">LTI message type (required) (default to &quot;null&quot;).</param>
        /// <param name="ltiVersion">LTI version (required) (default to &quot;null&quot;).</param>
        /// <param name="regKey">Tool proxy registration key (required) (default to &quot;null&quot;).</param>
        /// <param name="regPassword">Tool proxy registration password (required) (default to &quot;null&quot;).</param>
        /// <param name="regUrl">Tool proxy registration url (required) (default to &quot;null&quot;).</param>
        /// <param name="tcProfileUrl">Tool consumers profile URL (required) (default to &quot;null&quot;).</param>
        public ModLtiGetToolProxyRegistrationRequest200Response(string launchPresentationReturnUrl = @"null", string ltiMessageType = @"null", string ltiVersion = @"null", string regKey = @"null", string regPassword = @"null", string regUrl = @"null", string tcProfileUrl = @"null")
        {
            // to ensure "launchPresentationReturnUrl" is required (not null)
            if (launchPresentationReturnUrl == null)
            {
                throw new ArgumentNullException("launchPresentationReturnUrl is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.LaunchPresentationReturnUrl = launchPresentationReturnUrl;
            // to ensure "ltiMessageType" is required (not null)
            if (ltiMessageType == null)
            {
                throw new ArgumentNullException("ltiMessageType is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.LtiMessageType = ltiMessageType;
            // to ensure "ltiVersion" is required (not null)
            if (ltiVersion == null)
            {
                throw new ArgumentNullException("ltiVersion is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.LtiVersion = ltiVersion;
            // to ensure "regKey" is required (not null)
            if (regKey == null)
            {
                throw new ArgumentNullException("regKey is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.RegKey = regKey;
            // to ensure "regPassword" is required (not null)
            if (regPassword == null)
            {
                throw new ArgumentNullException("regPassword is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.RegPassword = regPassword;
            // to ensure "regUrl" is required (not null)
            if (regUrl == null)
            {
                throw new ArgumentNullException("regUrl is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.RegUrl = regUrl;
            // to ensure "tcProfileUrl" is required (not null)
            if (tcProfileUrl == null)
            {
                throw new ArgumentNullException("tcProfileUrl is a required property for ModLtiGetToolProxyRegistrationRequest200Response and cannot be null");
            }
            this.TcProfileUrl = tcProfileUrl;
        }

        /// <summary>
        /// URL to redirect on registration completion
        /// </summary>
        /// <value>URL to redirect on registration completion</value>
        [DataMember(Name = "launch_presentation_return_url", IsRequired = true, EmitDefaultValue = true)]
        public string LaunchPresentationReturnUrl { get; set; }

        /// <summary>
        /// LTI message type
        /// </summary>
        /// <value>LTI message type</value>
        [DataMember(Name = "lti_message_type", IsRequired = true, EmitDefaultValue = true)]
        public string LtiMessageType { get; set; }

        /// <summary>
        /// LTI version
        /// </summary>
        /// <value>LTI version</value>
        [DataMember(Name = "lti_version", IsRequired = true, EmitDefaultValue = true)]
        public string LtiVersion { get; set; }

        /// <summary>
        /// Tool proxy registration key
        /// </summary>
        /// <value>Tool proxy registration key</value>
        [DataMember(Name = "reg_key", IsRequired = true, EmitDefaultValue = true)]
        public string RegKey { get; set; }

        /// <summary>
        /// Tool proxy registration password
        /// </summary>
        /// <value>Tool proxy registration password</value>
        [DataMember(Name = "reg_password", IsRequired = true, EmitDefaultValue = true)]
        public string RegPassword { get; set; }

        /// <summary>
        /// Tool proxy registration url
        /// </summary>
        /// <value>Tool proxy registration url</value>
        [DataMember(Name = "reg_url", IsRequired = true, EmitDefaultValue = true)]
        public string RegUrl { get; set; }

        /// <summary>
        /// Tool consumers profile URL
        /// </summary>
        /// <value>Tool consumers profile URL</value>
        [DataMember(Name = "tc_profile_url", IsRequired = true, EmitDefaultValue = true)]
        public string TcProfileUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiGetToolProxyRegistrationRequest200Response {\n");
            sb.Append("  LaunchPresentationReturnUrl: ").Append(LaunchPresentationReturnUrl).Append("\n");
            sb.Append("  LtiMessageType: ").Append(LtiMessageType).Append("\n");
            sb.Append("  LtiVersion: ").Append(LtiVersion).Append("\n");
            sb.Append("  RegKey: ").Append(RegKey).Append("\n");
            sb.Append("  RegPassword: ").Append(RegPassword).Append("\n");
            sb.Append("  RegUrl: ").Append(RegUrl).Append("\n");
            sb.Append("  TcProfileUrl: ").Append(TcProfileUrl).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
