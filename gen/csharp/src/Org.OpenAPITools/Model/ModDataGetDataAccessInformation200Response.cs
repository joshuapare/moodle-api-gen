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
    /// ModDataGetDataAccessInformation200Response
    /// </summary>
    [DataContract(Name = "mod_data_get_data_access_information_200_response")]
    public partial class ModDataGetDataAccessInformation200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataGetDataAccessInformation200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModDataGetDataAccessInformation200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataGetDataAccessInformation200Response" /> class.
        /// </summary>
        /// <param name="canaddentry">Whether the user can add entries or not. (required) (default to null).</param>
        /// <param name="canapprove">Whether the user can approve entries or not. (required) (default to null).</param>
        /// <param name="canmanageentries">Whether the user can manage entries or not. (required) (default to null).</param>
        /// <param name="entrieslefttoadd">The number of entries left to complete the activity. (required) (default to null).</param>
        /// <param name="entrieslefttoview">The number of entries left to view other users entries. (required) (default to null).</param>
        /// <param name="groupid">User current group id (calculated) (required) (default to null).</param>
        /// <param name="inreadonlyperiod">Whether the database is in read mode only. (required) (default to null).</param>
        /// <param name="numentries">The number of entries the current user added. (required) (default to null).</param>
        /// <param name="timeavailable">Whether the database is available or not by time restrictions. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModDataGetDataAccessInformation200Response(bool canaddentry = null, bool canapprove = null, bool canmanageentries = null, int entrieslefttoadd = null, int entrieslefttoview = null, int groupid = null, bool inreadonlyperiod = null, int numentries = null, bool timeavailable = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Canaddentry = canaddentry;
            this.Canapprove = canapprove;
            this.Canmanageentries = canmanageentries;
            this.Entrieslefttoadd = entrieslefttoadd;
            this.Entrieslefttoview = entrieslefttoview;
            this.Groupid = groupid;
            this.Inreadonlyperiod = inreadonlyperiod;
            this.Numentries = numentries;
            this.Timeavailable = timeavailable;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Whether the user can add entries or not.
        /// </summary>
        /// <value>Whether the user can add entries or not.</value>
        [DataMember(Name = "canaddentry", IsRequired = true, EmitDefaultValue = true)]
        public bool Canaddentry { get; set; }

        /// <summary>
        /// Whether the user can approve entries or not.
        /// </summary>
        /// <value>Whether the user can approve entries or not.</value>
        [DataMember(Name = "canapprove", IsRequired = true, EmitDefaultValue = true)]
        public bool Canapprove { get; set; }

        /// <summary>
        /// Whether the user can manage entries or not.
        /// </summary>
        /// <value>Whether the user can manage entries or not.</value>
        [DataMember(Name = "canmanageentries", IsRequired = true, EmitDefaultValue = true)]
        public bool Canmanageentries { get; set; }

        /// <summary>
        /// The number of entries left to complete the activity.
        /// </summary>
        /// <value>The number of entries left to complete the activity.</value>
        [DataMember(Name = "entrieslefttoadd", IsRequired = true, EmitDefaultValue = true)]
        public int Entrieslefttoadd { get; set; }

        /// <summary>
        /// The number of entries left to view other users entries.
        /// </summary>
        /// <value>The number of entries left to view other users entries.</value>
        [DataMember(Name = "entrieslefttoview", IsRequired = true, EmitDefaultValue = true)]
        public int Entrieslefttoview { get; set; }

        /// <summary>
        /// User current group id (calculated)
        /// </summary>
        /// <value>User current group id (calculated)</value>
        [DataMember(Name = "groupid", IsRequired = true, EmitDefaultValue = true)]
        public int Groupid { get; set; }

        /// <summary>
        /// Whether the database is in read mode only.
        /// </summary>
        /// <value>Whether the database is in read mode only.</value>
        [DataMember(Name = "inreadonlyperiod", IsRequired = true, EmitDefaultValue = true)]
        public bool Inreadonlyperiod { get; set; }

        /// <summary>
        /// The number of entries the current user added.
        /// </summary>
        /// <value>The number of entries the current user added.</value>
        [DataMember(Name = "numentries", IsRequired = true, EmitDefaultValue = true)]
        public int Numentries { get; set; }

        /// <summary>
        /// Whether the database is available or not by time restrictions.
        /// </summary>
        /// <value>Whether the database is available or not by time restrictions.</value>
        [DataMember(Name = "timeavailable", IsRequired = true, EmitDefaultValue = true)]
        public bool Timeavailable { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModDataGetDataAccessInformation200Response {\n");
            sb.Append("  Canaddentry: ").Append(Canaddentry).Append("\n");
            sb.Append("  Canapprove: ").Append(Canapprove).Append("\n");
            sb.Append("  Canmanageentries: ").Append(Canmanageentries).Append("\n");
            sb.Append("  Entrieslefttoadd: ").Append(Entrieslefttoadd).Append("\n");
            sb.Append("  Entrieslefttoview: ").Append(Entrieslefttoview).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Inreadonlyperiod: ").Append(Inreadonlyperiod).Append("\n");
            sb.Append("  Numentries: ").Append(Numentries).Append("\n");
            sb.Append("  Timeavailable: ").Append(Timeavailable).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
