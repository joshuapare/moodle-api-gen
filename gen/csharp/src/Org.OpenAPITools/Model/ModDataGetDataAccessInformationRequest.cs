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
    /// ModDataGetDataAccessInformationRequest
    /// </summary>
    [DataContract(Name = "mod_data_get_data_access_information_request")]
    public partial class ModDataGetDataAccessInformationRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataGetDataAccessInformationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModDataGetDataAccessInformationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataGetDataAccessInformationRequest" /> class.
        /// </summary>
        /// <param name="databaseid">Database instance id. (required) (default to null).</param>
        /// <param name="groupid">Group id, 0 means that the function will determine the user group. (default to 0).</param>
        public ModDataGetDataAccessInformationRequest(int databaseid = null, int groupid = 0)
        {
            this.Databaseid = databaseid;
            this.Groupid = groupid;
        }

        /// <summary>
        /// Database instance id.
        /// </summary>
        /// <value>Database instance id.</value>
        [DataMember(Name = "databaseid", IsRequired = true, EmitDefaultValue = true)]
        public int Databaseid { get; set; }

        /// <summary>
        /// Group id, 0 means that the function will determine the user group.
        /// </summary>
        /// <value>Group id, 0 means that the function will determine the user group.</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModDataGetDataAccessInformationRequest {\n");
            sb.Append("  Databaseid: ").Append(Databaseid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
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