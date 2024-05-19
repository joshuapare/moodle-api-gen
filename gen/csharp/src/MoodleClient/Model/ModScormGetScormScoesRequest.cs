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
    /// ModScormGetScormScoesRequest
    /// </summary>
    [DataContract(Name = "mod_scorm_get_scorm_scoes_request")]
    public partial class ModScormGetScormScoesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormScoesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModScormGetScormScoesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormScoesRequest" /> class.
        /// </summary>
        /// <param name="organization">organization id (default to &quot;&quot;).</param>
        /// <param name="scormid">scorm instance id (required) (default to null).</param>
        public ModScormGetScormScoesRequest(string organization = @"", int scormid = null)
        {
            this.Scormid = scormid;
            // use default value if no "organization" provided
            this.Organization = organization ?? @"";
        }

        /// <summary>
        /// organization id
        /// </summary>
        /// <value>organization id</value>
        [DataMember(Name = "organization", EmitDefaultValue = false)]
        public string Organization { get; set; }

        /// <summary>
        /// scorm instance id
        /// </summary>
        /// <value>scorm instance id</value>
        [DataMember(Name = "scormid", IsRequired = true, EmitDefaultValue = true)]
        public int Scormid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModScormGetScormScoesRequest {\n");
            sb.Append("  Organization: ").Append(Organization).Append("\n");
            sb.Append("  Scormid: ").Append(Scormid).Append("\n");
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
