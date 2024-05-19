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
    /// CoreGetStringsRequestStringsInner
    /// </summary>
    [DataContract(Name = "core_get_strings_request_strings_inner")]
    public partial class CoreGetStringsRequestStringsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGetStringsRequestStringsInner" /> class.
        /// </summary>
        /// <param name="component">component (default to &quot;moodle&quot;).</param>
        /// <param name="lang">lang.</param>
        /// <param name="stringid">string identifier.</param>
        /// <param name="stringparams">stringparams.</param>
        public CoreGetStringsRequestStringsInner(string component = @"moodle", string lang = default(string), string stringid = default(string), List<CoreGetStringsRequestStringsInnerStringparamsInner> stringparams = default(List<CoreGetStringsRequestStringsInnerStringparamsInner>))
        {
            // use default value if no "component" provided
            this.Component = component ?? @"moodle";
            this.Lang = lang;
            this.Stringid = stringid;
            this.Stringparams = stringparams;
        }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// lang
        /// </summary>
        /// <value>lang</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// string identifier
        /// </summary>
        /// <value>string identifier</value>
        [DataMember(Name = "stringid", EmitDefaultValue = false)]
        public string Stringid { get; set; }

        /// <summary>
        /// Gets or Sets Stringparams
        /// </summary>
        [DataMember(Name = "stringparams", EmitDefaultValue = false)]
        public List<CoreGetStringsRequestStringsInnerStringparamsInner> Stringparams { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGetStringsRequestStringsInner {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  Stringid: ").Append(Stringid).Append("\n");
            sb.Append("  Stringparams: ").Append(Stringparams).Append("\n");
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
