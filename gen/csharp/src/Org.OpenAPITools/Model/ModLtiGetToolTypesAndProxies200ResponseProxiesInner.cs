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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModLtiGetToolTypesAndProxies200ResponseProxiesInner
    /// </summary>
    [DataContract(Name = "mod_lti_get_tool_types_and_proxies_200_response_proxies_inner")]
    public partial class ModLtiGetToolTypesAndProxies200ResponseProxiesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiGetToolTypesAndProxies200ResponseProxiesInner" /> class.
        /// </summary>
        /// <param name="capabilityoffered">Tool proxy capabilities offered.</param>
        /// <param name="guid">Tool proxy globally unique identifier.</param>
        /// <param name="id">Tool proxy id.</param>
        /// <param name="name">Tool proxy name.</param>
        /// <param name="regurl">Tool proxy registration URL.</param>
        /// <param name="secret">Tool proxy shared secret.</param>
        /// <param name="serviceoffered">Tool proxy services offered.</param>
        /// <param name="state">Tool proxy state.</param>
        /// <param name="timecreated">Tool proxy time created.</param>
        /// <param name="timemodified">Tool proxy modified.</param>
        /// <param name="toolproxy">Tool proxy.</param>
        /// <param name="vendorcode">Tool proxy consumer code.</param>
        public ModLtiGetToolTypesAndProxies200ResponseProxiesInner(string capabilityoffered = default(string), string guid = default(string), int id = default(int), string name = default(string), string regurl = default(string), string secret = default(string), string serviceoffered = default(string), int state = default(int), int timecreated = default(int), int timemodified = default(int), string toolproxy = default(string), string vendorcode = default(string))
        {
            this.Capabilityoffered = capabilityoffered;
            this.Guid = guid;
            this.Id = id;
            this.Name = name;
            this.Regurl = regurl;
            this.Secret = secret;
            this.Serviceoffered = serviceoffered;
            this.State = state;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Toolproxy = toolproxy;
            this.Vendorcode = vendorcode;
        }

        /// <summary>
        /// Tool proxy capabilities offered
        /// </summary>
        /// <value>Tool proxy capabilities offered</value>
        [DataMember(Name = "capabilityoffered", EmitDefaultValue = false)]
        public string Capabilityoffered { get; set; }

        /// <summary>
        /// Tool proxy globally unique identifier
        /// </summary>
        /// <value>Tool proxy globally unique identifier</value>
        [DataMember(Name = "guid", EmitDefaultValue = false)]
        public string Guid { get; set; }

        /// <summary>
        /// Tool proxy id
        /// </summary>
        /// <value>Tool proxy id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Tool proxy name
        /// </summary>
        /// <value>Tool proxy name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Tool proxy registration URL
        /// </summary>
        /// <value>Tool proxy registration URL</value>
        [DataMember(Name = "regurl", EmitDefaultValue = false)]
        public string Regurl { get; set; }

        /// <summary>
        /// Tool proxy shared secret
        /// </summary>
        /// <value>Tool proxy shared secret</value>
        [DataMember(Name = "secret", EmitDefaultValue = false)]
        public string Secret { get; set; }

        /// <summary>
        /// Tool proxy services offered
        /// </summary>
        /// <value>Tool proxy services offered</value>
        [DataMember(Name = "serviceoffered", EmitDefaultValue = false)]
        public string Serviceoffered { get; set; }

        /// <summary>
        /// Tool proxy state
        /// </summary>
        /// <value>Tool proxy state</value>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public int State { get; set; }

        /// <summary>
        /// Tool proxy time created
        /// </summary>
        /// <value>Tool proxy time created</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Tool proxy modified
        /// </summary>
        /// <value>Tool proxy modified</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Tool proxy
        /// </summary>
        /// <value>Tool proxy</value>
        [DataMember(Name = "toolproxy", EmitDefaultValue = false)]
        public string Toolproxy { get; set; }

        /// <summary>
        /// Tool proxy consumer code
        /// </summary>
        /// <value>Tool proxy consumer code</value>
        [DataMember(Name = "vendorcode", EmitDefaultValue = false)]
        public string Vendorcode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiGetToolTypesAndProxies200ResponseProxiesInner {\n");
            sb.Append("  Capabilityoffered: ").Append(Capabilityoffered).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Regurl: ").Append(Regurl).Append("\n");
            sb.Append("  Secret: ").Append(Secret).Append("\n");
            sb.Append("  Serviceoffered: ").Append(Serviceoffered).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Toolproxy: ").Append(Toolproxy).Append("\n");
            sb.Append("  Vendorcode: ").Append(Vendorcode).Append("\n");
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
