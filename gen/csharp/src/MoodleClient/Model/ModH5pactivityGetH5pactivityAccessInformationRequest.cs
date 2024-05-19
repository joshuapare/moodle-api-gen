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
    /// ModH5pactivityGetH5pactivityAccessInformationRequest
    /// </summary>
    [DataContract(Name = "mod_h5pactivity_get_h5pactivity_access_information_request")]
    public partial class ModH5pactivityGetH5pactivityAccessInformationRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetH5pactivityAccessInformationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModH5pactivityGetH5pactivityAccessInformationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityGetH5pactivityAccessInformationRequest" /> class.
        /// </summary>
        /// <param name="h5pactivityid">h5p activity instance id (required).</param>
        public ModH5pactivityGetH5pactivityAccessInformationRequest(int h5pactivityid = default(int))
        {
            this.H5pactivityid = h5pactivityid;
        }

        /// <summary>
        /// h5p activity instance id
        /// </summary>
        /// <value>h5p activity instance id</value>
        [DataMember(Name = "h5pactivityid", IsRequired = true, EmitDefaultValue = true)]
        public int H5pactivityid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModH5pactivityGetH5pactivityAccessInformationRequest {\n");
            sb.Append("  H5pactivityid: ").Append(H5pactivityid).Append("\n");
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
